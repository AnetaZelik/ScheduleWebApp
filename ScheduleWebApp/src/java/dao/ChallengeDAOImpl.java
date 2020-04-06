package dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Challenge;

@Stateless
public class ChallengeDAOImpl implements ChallengeDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void saveChallenge(Challenge challenge) {
        em.persist(challenge);
    }

    @Override
    public List<Challenge> getChallenges() {
        return em.createQuery("select c from Challenge c", Challenge.class)
                .getResultList();
    }

}
