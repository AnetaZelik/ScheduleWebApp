package controllers;

import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Challenge;
import dao.ChallengeDAO;

@WebServlet(urlPatterns = {"/personList"})
public class ChallengesListServlet extends HttpServlet {
    @Inject
    private ChallengeDAO dao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        List<Challenge> persons = dao.getPersons();
        req.setAttribute("persons", persons);
        getServletContext().getRequestDispatcher("/listPersons.jsp").forward(req, resp);
    }
    
    
}
