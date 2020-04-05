package hv13;

public class UtilityTraller extends Traller{
    private String floor;

    public UtilityTraller(int lenght, int price, String floor) {
        super(lenght, price);
        this.floor = floor;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }


}
