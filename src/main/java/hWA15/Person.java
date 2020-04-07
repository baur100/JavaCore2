package hWA15;

public class Person {
    private Name name;
    private Address address;

    public Person(Name name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Name getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
    public String printInfo(){
        return name.printInfo()+ " "+address.printInfo();

    }
}
