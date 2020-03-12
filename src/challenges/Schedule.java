package challenges;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Schedule {
    List<Challenge> challenges = new ArrayList<>();

    public void setChallenge(Challenge challenge) {
        challenges.add(challenge);
    }

    public void setChallenge(String name, int day, Month month, DayOfTheWeek dayOfTheWeek, Duration duration) {
        Challenge nextChallenge = new Challenge(name, day, month, dayOfTheWeek, duration);
        challenges.add(nextChallenge);
    }

    void showAllChallenges() {
        System.out.println(challenges);
    }

    int getChallengesNumber() {
        return challenges.size();
    }
}
