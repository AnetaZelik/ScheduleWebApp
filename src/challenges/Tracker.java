package challenges;

import java.time.Duration;
import static challenges.DayOfTheWeek.*;
import static challenges.Month.*;

public class Tracker {
    public static void main(String[] args) {
        Schedule schedule = new Schedule();

        schedule.setChallenge("challenge1", 1, JANUARY, MONDAY, Duration.ofDays(30));
        schedule.setChallenge("challenge2", 2, FEBRUARY, TUESDAY, Duration.ofDays(10));

        Challenge challenge3 = new Challenge("challenge3", 3, MAY, WEDNESDAY, Duration.ofDays(5));
        Challenge challenge4 = new Challenge("challenge4", 4, JULY, FRIDAY, Duration.ofDays(30));
        schedule.setChallenge(challenge3);
        schedule.setChallenge(challenge4);

        schedule.showAllChallenges();

        System.out.println(schedule.getChallengesNumber());

    }
}
