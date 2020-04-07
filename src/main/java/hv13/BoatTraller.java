package hv13;

public class BoatTraller extends Traller{
    private int numberOfWeels;

    public BoatTraller(int lenght, int price, int numberOfWeels) {
        super(lenght, price);
        this.numberOfWeels = numberOfWeels;
    }

    public int getNumberOfWeels() {
        return numberOfWeels;
    }

    public void setNumberOfWeels(int numberOfWeels) {
        this.numberOfWeels = numberOfWeels;
    }

    @Override
    public void standartBallSize() {
        System.out.println(" Boat traller's standart for hith  ball size is 2.0");
    }
}

