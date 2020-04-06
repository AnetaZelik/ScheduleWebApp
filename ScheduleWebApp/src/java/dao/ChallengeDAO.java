package dao;

import java.util.List;

import model.Challenge;

public interface ChallengeDAO {
    void saveChallenge(Challenge challenge);

    List<Challenge> getChallenges();
}
