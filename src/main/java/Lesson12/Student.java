package Lesson12;

public class Student extends Person {
    protected String major;
    protected String program;

    public Student(String name, String lastname, int year, String gender, Address address, String major, String program) {
        super(name, lastname, year, gender, address); //вызов конструктора родительского класса

        this.name = name;
        this.lastname = lastname;
        this.year = year;
        this.gender = gender;
        this.address = address;
        this.major = major;
        this.program = program;
    }

    public String getMajor() {
        return major;
    }

    public String getProgram() {
        return program;
    }
}
