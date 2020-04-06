package L12;

public final class Teacher extends Person{
    private String subject;

    public Teacher(String name, String lastName, int year, String gender, Address address, String subject) {
        super(name,lastName,year,gender,address);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
}
