package hw11;

public class Keyboard {
    private String brand;
    private String model;
    private double price;

    public Keyboard(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void printInfo() {
        System.out.println();
        System.out.println("Keyboard Brand - " + this.brand +
                "\nKeyboard Model - " + this.model +
                "\nKeyboard Price - $" + this.price);

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}
