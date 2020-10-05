import java.util.ArrayList;
import java.util.Date;

public class Ballot {

    private Integer id;
    private String timeSubmitted;
    private String emailAddress;
    private String[] decisions;

    // constructors
    public Ballot(){
        id = 0;
        timeSubmitted = "";
        emailAddress = "";
    }

    public Ballot(Integer id, String timeSubmitted, String emailAddress, String[] decisions){
        this.id = id;
        this.timeSubmitted = timeSubmitted;
        this.emailAddress = emailAddress;
        this.decisions = decisions;
    }

    // getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTimeSubmitted() {
        return timeSubmitted;
    }

    public void setTimeSubmitted(String timeSubmitted) {
        this.timeSubmitted = timeSubmitted;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String[] getDecisions() {
        return decisions;
    }

    public void setDecisions(String[] decisions) {
        this.decisions = decisions;
    }

}
