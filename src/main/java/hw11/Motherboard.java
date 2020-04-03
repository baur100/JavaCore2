package hw11;

public class Motherboard {
    private String brand;
    private String model;

    public Motherboard(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public void printInfo() {
        System.out.println("Motherboard {brand = " + brand + ", model = " + model+'}');
    }
}
