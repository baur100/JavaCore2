package hw12_2;

public class Address {
    private String streetAddress;
    private int zip;
    private int streetNumber;

    public Address() {
    }

    public Address(String streetAddress, int zip, int streetNumber) {
        this.streetAddress = streetAddress;
        this.zip = zip;
        this.streetNumber = streetNumber;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public int getZip() {
        return zip;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public void printInfo() {
        System.out.println("Library{" +
                "streetAddress='" + streetAddress + '\'' +
                ", zip=" + zip +
                ", streetNumber=" + streetNumber +
                '}');
    }
}

