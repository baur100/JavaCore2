package hw11_z;

public class Address {
    private String state;
    private String city;
    private String street;

    public Address(String state, String city, String street) {
        this.state = state;
        this.city = city;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getStreet() {
        return street;
    }

    public void printAddress() {
        String address = "Address{" +
                "street='" + street + '\'' +
                ", state='" + state + '\'' +
                '}';
        System.out.println(address);
    }
}