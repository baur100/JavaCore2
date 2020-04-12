package homework16part2;

public class Address {
    private String street;
    private String city;
    private String state;
    private Integer zipcode;

    public Address(String street, String city, String state, Integer zipcode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }
    public String getStreet() {

        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public Integer getZipcode() {
        return zipcode;
    }
    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }
    public void printInfo(){
        System.out.println(street+" "+ city + " "+ state + " "+ zipcode+".");
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode=" + zipcode +
                '}';
    }
}
