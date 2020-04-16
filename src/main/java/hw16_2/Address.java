package hw16_2;

public class Address {
    private String street;
    private String town;
    private String state;
    private int zip;

    public Address(String street, String town, String state, int zip) {
        this.street = street;
        this.town = town;
        this.state = state;
        this.zip = zip;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", town='" + town + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                '}';
    }

    public void printInfo() {
        System.out.println("Hospital address : " + street + ", " + town + ", " + state + ", " + zip);
    }

}

