package homework.hw16_part2;

public class Address {
    private int number;
    private String streetAddress;
    private String town;
    private State state;
    private int zipCode;

    public Address(int number, String streetAddress, String town, State state, int zipCode) {
        this.number = number;
        this.streetAddress = streetAddress;
        this.town = town;
        this.state = state;
        this.zipCode = zipCode;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public void printAddress(){
        System.out.println(this.number+" "+this.streetAddress+", "+this.town+", "+this.state.toString()+", "+this.zipCode);
    }
}
