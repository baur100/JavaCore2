package hw_13;

public class Address {
    private String stName;
    private int houseNum;
    private int zipCode;

    public Address(String stName, int houseNum, int zipCode) {
        this.stName = stName;
        this.houseNum = houseNum;
        this.zipCode = zipCode;
    }

    public int getZipCode() {
        return zipCode;
    }

    public int getHouseNum() {
        return houseNum;
    }

    public String getStName() {
        return stName;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }
}
