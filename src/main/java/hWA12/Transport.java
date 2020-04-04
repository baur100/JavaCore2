package hWA12;

public class Transport {
    protected int quantityOfWheels;
    protected int price;
    protected String type;
    protected String fuel;

    public Transport(int quantityOfWheels, int price, String type, String fuel) {
        this.quantityOfWheels = quantityOfWheels;
        this.price = price;
        this.type = type;
        this.fuel = fuel;
    }
    public Transport(int price, String type, String fuel) {
        this.price = price;
        this.type = type;
        this.fuel = fuel;
    }
    public Transport(){}

    public int getQuantityOfWheels() {
        return quantityOfWheels;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getFuel() {
        return fuel;
    }
    public void printInfo(){

    }
}
