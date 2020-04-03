package hw11_z;

public class Address {
    private Listening state;
    private String city;
    private String street;

    public Address(Listening state, String city, String street) {
        this.state = state;
        this.city = city;
        this.street = street;
    }

    public String getCity() { return city;
    }

    public Listening getState() { return state;
    }

    public String getStreet() { return street;
    }

    public void printAddress() {
        String address = "Address{" + state+
                "street='" + street + '\'' +
                ", state='" + state + '\'' +
                '}';
        System.out.println(address);
    }
}