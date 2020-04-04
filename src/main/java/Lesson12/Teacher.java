package Lesson12;

public final class Teacher extends Person {//невозможно наследование
    private String subject;


    public Teacher(String name, String lastname, int year, String gender, Address address, String subject) {
        super(name, lastname, year, gender, address);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
}
