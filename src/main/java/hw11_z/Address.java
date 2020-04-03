package hw11_z;

public class Address {
    public String state;
    public String city;
    public String str;
    public int zip;

    public Address(String state, String city, String str, int zip) {
        this.state = state;
        this.city = city;
        this.str = str;
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public int getZip() {
        return zip;
    }

    public String getState() {
        return state;
    }

    public String getStr() {
        return str;
    }

    public void printAddress1() {
        System.out.println("We are selling a house in " + state + " " + city + " " + str + "zip" + zip);


    }

    public void printAddress2() {
        System.out.println("We are owning a house in " + state + " " + city + " " + str + ", zip " + zip);
    }

    public void printAddress3() {
        System.out.println("We are living in " + state + " , " + city + " " + str + ", zip " + zip);
    }
}




