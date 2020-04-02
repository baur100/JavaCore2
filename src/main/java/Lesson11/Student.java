package Lesson11;

public class Student {
    private String name;
    private String lastName;
    private Address address;
    private int id;
    private String major;


    public Student(String name, String lastName, Address address, int id, String major) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.id = id;
        this.major = major;
    }
}
