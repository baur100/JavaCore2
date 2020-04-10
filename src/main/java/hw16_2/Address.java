package hw16_2;

public class Address {
    private int streetNumber;
    private String streetName;
    private String city;
    private String state;
    private int zipcode;

    public Address(int streetNumber, String streetName, String city, String state, int zipcode) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String printAddress(){
        return ("Address: "+streetNumber+" "+streetName+" "+city+" "
        +state+" "+zipcode);
    }
}
