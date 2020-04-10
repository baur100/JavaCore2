package hWA11;

public class Address {
    private String strAddress;
    private String sity;
    private String county;
    private int zipCode;

    public Address(String strAddress, String sity, String county, int zipCode) {
        this.strAddress = strAddress;
        this.sity = sity;
        this.county = county;
        this.zipCode = zipCode;
    }

    public String getStrAddress() {
        return strAddress;
    }

    public String getSity() {
        return sity;
    }

    public String getCounty() {
        return county;
    }

    public int getZipCode() {
        return zipCode;
    }
    public void printInfo(){
        System.out.println("Address: "+strAddress+", "+sity+", "+county+", "+zipCode);
    }
}
