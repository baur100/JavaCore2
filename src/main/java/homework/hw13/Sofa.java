package homework.hw13;

public class Sofa implements Furniture {
    protected double height;
    protected String brand;
    protected String model;

    public Sofa(double height, String brand, String model) {
        this.height = height;
        this.brand = brand;
        this.model = model;
    }

    public void getInfo() {
        System.out.println("Sofas height is " + this.height);
        System.out.println("Sofas brand is " + this.brand);
        System.out.println("Sofas modal is " + this.model);
    }
}
