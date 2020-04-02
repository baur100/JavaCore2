package myLesson11;

public class Person {
    private String name;
    private String lastName;
    private Address address;

    public Person(String name, String lastName, Address address) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}

