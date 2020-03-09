package challenges;

import java.time.Duration;

public class Challenge {
    private String name;
    private int day;
    private Month month;
    private DayOfTheWeek dayOfTheWeek;
    private Duration duration;

    public Challenge(String name, int day, Month month, DayOfTheWeek dayOfTheWeek, Duration duration) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.dayOfTheWeek = dayOfTheWeek;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }
    public int getDay() {
        return day;
    }
    public Duration getDuration(){return duration;}

    @Override
    public String toString() {
        return "Challenge{" +
                "name='" + name + '\'' +
                ", day=" + day +
                '}';
    }
}
