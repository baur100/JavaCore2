package hw11;

public class Monitor {
    private String brand;
    private String model;
    private int size;
    private double price;

    public Monitor(String brand, String model, int size, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
    }

    public void printInfo() {
        System.out.println();
        System.out.println("Monitor Brand - " + this.brand +
                "\nMonitor Model - " + this.model +
                "\nMonitor Size - " + this.size + " inch" +
                "\nMonitor Price - $" + this.price);

    }
}
