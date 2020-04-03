package hw_11_part2;

public class Address {
    private String streetName;
    private int zipCode;
    private int streetNum;

    public Address(){}

    public Address(String main_st, int i, int i1) {
    }


    public void Address (String streetName, int zipCode, int streetNum){
        this.streetName =streetName;
        this.zipCode =zipCode;
        this.streetNum=streetNum;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public int getStreetNum() {
        return streetNum;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setStreetNum(int streetNum) {
        this.streetNum = streetNum;
    }

    public void printInfo(){
        System.out.println();
    }
}
