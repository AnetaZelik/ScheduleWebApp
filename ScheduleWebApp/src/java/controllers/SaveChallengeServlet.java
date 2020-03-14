package controllers;

import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Challenge;
import dao.ChallengeDAO;

@WebServlet(urlPatterns = {"/saveChallenge"})
public class SaveChallengeServlet extends HttpServlet {

    @Inject
    private ChallengeDAO dao;

    private Challenge formToChallenge(HttpServletRequest req) {
        Challenge challenge = new Challenge();
        challenge.setChallengeName(req.getParameter("name"));
        challenge.setChallengeDuration(req.getParameter("duration"));
        challenge.setChallengeCategory(req.getParameter("category"));
        return challenge;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Challenge challenge = formToChallenge(req);
        dao.saveChallenge(challenge);
        resp.sendRedirect(req.getContextPath() + "/index.html");
    }

}
