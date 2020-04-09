package hw16_2;

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

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getTown() {
        return town;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }
    public void printInfo(){
        System.out.println(streetAddress + ", " + town + ", " + state + ", " + zip);
    }
}
