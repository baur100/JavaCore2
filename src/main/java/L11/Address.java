package L11;

public class Address {
    private String street;
    private String town;
    private int zip;
    private String state;

    public Address(String street, String town, int zip, String state) {
        this.street = street;
        this.town = town;
        this.zip = zip;
        this.state = state;
    }


    public void printAddress() {
        String address =  "Address{" +
                "street='" + street + '\'' +
                ", town='" + town + '\'' +
                ", zip=" + zip +
                ", state='" + state + '\'' +
                '}';
        System.out.println(address);
    }
}
