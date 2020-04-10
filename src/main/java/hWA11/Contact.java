package hWA11;

public class Contact {
    private Name name;
    private Address address;
    private Insurance insurance;

    public Contact(Name name, Address address, Insurance insurance) {
        this.name = name;
        this.address = address;
        this.insurance = insurance;
    }

    public Name getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Insurance getInsurance() {
        return insurance;
    }
    public void printInfo(){
        name.printInfo();
        address.printInfo();
        insurance.printInfo();
    }
}
