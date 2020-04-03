package hw11;

public class Processor {
    private String brand;
    private String model;
    private double speed;

    public Processor(String brand, String model, double speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    public void printInfo() {
        System.out.println("Processor {brand = " + brand + ", model = " + model + ", speed = " + speed+'}');
    }
}
