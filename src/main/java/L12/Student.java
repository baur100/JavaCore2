package L12;

public class Student extends Person {
    protected String major;
    protected String program;

    public Student(String name, String lastName, int year, String gender, Address address, String major, String program) {
        super(name, lastName, year, gender, address);
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
