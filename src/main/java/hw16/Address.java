package hw16;

public class Address {
    private String streetAddress;
    private String town;
    private String state;
    private int zip;

    public Address(String streetAddress, String town, String state, int zip) {
        this.streetAddress = streetAddress;
        this.town = town;
        this.state = state;
        this.zip = zip;
    }

    public String getAddress() {
        return "Address: " + streetAddress + " " + town +" " + state + " " + zip + '\n';
    }
}
