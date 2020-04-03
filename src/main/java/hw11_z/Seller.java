package hw11_z;

public class Seller {
    private String name;
    private String lastName;
    private Address address;
    private Listening listening;

    public Seller(String name, String lastName, Address address, Listening listening) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.listening = listening;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public Listening getListening() {
        return listening;
    }

    public void printSellerInfo() {
        String seller = "Seller{" +
                "name='" + name +" "+ lastName + '\'' +
                ", address=" + address +
                ", property='" + listening + '\'' +
                '}';
        System.out.println(seller);
//        listening.printListening();

    }
}
