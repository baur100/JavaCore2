package hw11;

public class Disk {
    private String brand;
    private String model;
    private int capacity;
    private double price;

    public Disk(String brand, String model, int capacity, double price) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
        this.price = price;
    }

    public Disk() {
    }

    public void printInfo() {
        System.out.println();
        System.out.println("Hard Drive Brand - " + this.brand +
                "\nHard Drive Model - " + this.model +
                "\nHard Drive Capacity - " + this.capacity + " GB" +
                "\nHard Drive Price - $" + this.price);

    }

}
