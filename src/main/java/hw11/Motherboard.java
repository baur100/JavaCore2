package hw11;

public class Motherboard {
    private String brand;
    private String model;
    private String chipset;
    private double price;

    public Motherboard() {
    }

    public Motherboard(String brand, String model, String chipset, double price) {
        this.brand = brand;
        this.model = model;
        this.chipset = chipset;
        this.price = price;
    }

    public void printInfo() {
        System.out.println();
        System.out.println("Motherboard Brand - " + this.brand +
                "\nMotherboard Model - " + this.model +
                "\nMotherboard Chipset - " + this.chipset +
                "\nMotherboard Price - $" + this.price);

    }
}
