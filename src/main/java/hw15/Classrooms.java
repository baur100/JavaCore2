package hw15;


public class Classrooms {
    private Integer number;
    private String subject;

    public Classrooms(Integer number, String subject) {
        this.number = number;
        this.subject = subject;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Classrooms{" +
                "number=" + number +
                ", subject='" + subject + '\'' +
                '}';
    }
}

