package Less11;

public class Address {
    private String street;
    private Integer bldnumber;
    private String city;
    private Integer zipcode;

    public Address(String street, int i, String city, int zipcode) {
    }
    public void printAddress(){
        System.out.println(bldnumber + " "+ street + " "+ city+" "+ zipcode);
}

}
