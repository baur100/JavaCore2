package Lesson13;

public class DeskLight implements PowerSocket, Bulb {
    protected int price;
    protected String brand;
    protected String model;

    public DeskLight(int price, String brand, String model) {
        this.price = price;
        this.brand = brand;
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void StandardEBulb() {
        System.out.println("I use standard E27 Bulb");
    }

    @Override
    public void standardUsSocket() {
        System.out.println("I use standard US socket");
    }
}

