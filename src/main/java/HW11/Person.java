package HW11;

public class Person {
    private String name;
    private String lastname;
    private Adrress address;

    public Person(String name, String lastname, Adrress address) {
        this.name = name;
        this.lastname = lastname;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public Adrress getAddress() {
        return address;
    }

}
