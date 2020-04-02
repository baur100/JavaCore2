package hw11;

public class Mouse {
    private String brand;
    private String model;
    private double price;

    public Mouse(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void printInfo() {
        System.out.println();
        System.out.println("Mouse Brand - " + this.brand +
                "\nMouse Model - " + this.model +
                "\nMouse Price - $" + this.price);

    }
}
