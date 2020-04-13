package homework.hw12;

public class Microwave extends Specifications {
    protected String brand;
    protected String model;

    public Microwave(double height, double width, double lenght, double price, String brand, String model) {
        super(height, width, lenght, price);
        this.brand = brand;
        this.model = model;
    }
}
