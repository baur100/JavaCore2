package L12;

public class Person{
    protected String name;
    protected String lastName;
    protected int year;
    protected String gender;
    protected Address address;

    public Person() {}

    public Person(String name, String lastName, int year, String gender, Address address) {
        this.name = name;
        this.lastName = lastName;
        this.year = year;
        this.gender = gender;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
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
