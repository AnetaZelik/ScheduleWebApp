package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Challenge implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private long id;
    private String challengeName;
    private String challengeDuration;
    private String challengeCategory;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getChallengeName() {
        return challengeName;
    }

    public void setChallengeName(String challengeName) {
        this.challengeName = challengeName;
    }

    public String getChallengeDuration() {
        return challengeDuration;
    }

    public void setChallengeDuration(String challengeDuration) {
        this.challengeDuration = challengeDuration;
    }

    public String getChallengeCategory() {
        return challengeCategory;
    }

    public void setChallengeCategory(String challengeCategory) {
        this.challengeCategory = challengeCategory;
    }

    @Override
    public String toString() {
        return "Challenge{"
                + "id=" + id
                + ", challengeName=" + challengeName
                + ", challengeDuration=" + challengeDuration
                + ", challengeCategory=" + challengeCategory
                + '}';
    }

}
