package Lesson12;

//родительский класс !!!!
public class Person {
    protected String name;
    protected String lastname;
    protected int year;
    protected String gender;
    protected Address address;

    public Person(String name, String lastname, int year, String gender, Address address) {
        this.name = name;
        this.lastname = lastname;
        this.year = year;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getYear() {
        return year;
    }

    public String getGender() {
        return gender;
    }

    public Address getAddress() {
        return address;
    }
}
