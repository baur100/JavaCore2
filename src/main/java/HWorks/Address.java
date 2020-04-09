package HWorks;

public class Address {
    private String street;
    private String town;
    private int zip;
    private String state;

    public Address(String street, String town, String state,int zip) {
        this.street = street;
        this.town = town;
        this.state = state;
        this.zip = zip;
    }


    public void printAddress() {
        String address =  "Address: " +
                street + ','
                + town + ' ' +
                 state+'\n'+
                "Zip: "+
                zip
                ;
        System.out.println(address);
    }
}
