package hw11;

public class RAM {
    private String brand;
    private String model;
    private int capacity;
    private double price;

    public RAM(String brand, String model, int capacity, double price) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
        this.price = price;
    }

    public void printInfo() {
        System.out.println();
        System.out.println("RAM Brand - " + this.brand +
                "\nRAM Model - " + this.model +
                "\nRAM Capacity - " + this.capacity + " GB" +
                "\nRAM Price - $" + this.price);

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getPrice() {
        return price;
    }
}
