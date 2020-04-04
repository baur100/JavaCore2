package myLesson13;

public class DeskLight implements PowerSocket, Bulb {
    protected int price;
    protected String brand;
    protected String model;

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public DeskLight(int price, String brand, String model) {
        this.price = price;
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void standartEBulb() {
        System.out.println("I use standart E27 Bulb");

    }

    @Override
    public void standartUsSocket() {
        System.out.println("I use standart US socket");

    }
}
