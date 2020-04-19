package homework.hw16;


import java.util.ArrayList;

public class Publishing {
    private String name;
    private int yearFounded;
    private Address address;

    public Publishing(String name, int yearFounded, Address address) {
        this.name = name;
        this.yearFounded = yearFounded;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearFounded() {
        return yearFounded;
    }

    public void setYearFounded(int yearFounded) {
        this.yearFounded = yearFounded;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void printPublishingInfo(){
        System.out.println("PUBLISHING: "+this.name);
        System.out.println("Founded: "+this.yearFounded);
        System.out.println("Address: ");
        this.address.printAddress();
        System.out.println();
    }


}
