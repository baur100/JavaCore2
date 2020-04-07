package hw11_Person;

public class Address {
    private int streetNumber;
    private String streetName;
    private int aptNumber;
    private String city;
    private String state;
    private int zipcode;

    public Address(int streetNumber, String streetName, int aptNumber, String city, String state, int zipcode) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.aptNumber = aptNumber;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public Address(int streetNumber, String streetName, String city, String state, int zipcode) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public void printAddress(){
        System.out.println("Home address: "+streetNumber+" "+streetName+", "+"apt.#"+aptNumber+", "+city+" "+state+" "+zipcode);
    }


}
