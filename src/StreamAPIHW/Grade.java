package StreamAPIHW;

public class Grade {
    String subject;
    double score;

    Grade(String subject, double score) {
        this.subject = subject;
        this.score = score;
    }

    public String getSubject() {
        return subject;
    }

    public double getScore() {
        return score;
    }
}
