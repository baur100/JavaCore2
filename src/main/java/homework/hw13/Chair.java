package homework.hw13;

public class Chair implements Furniture {
    protected double height;
    protected String brand;
    protected String model;

    public Chair(double height, String brand, String model) {
        this.height = height;
        this.brand = brand;
        this.model = model;
    }

    public void getInfo() {
        System.out.println("Chair height is " + this.height);
        System.out.println("Chair brand is " + this.brand);
        System.out.println("Chair model is " + this.model);
    }
}
