package hWA15;

public class Address {
    private String address1;
    private String address2;

    public Address(String address1, String address2) {
        this.address1 = address1;
        this.address2 = address2;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }
    public String printInfo(){
        return "Address is: "+address1+" "+address2;
    }
}
