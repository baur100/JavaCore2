package hw11_z;

public class Monitor {
    private String brand;
    private String model;
    private int dimensions;

    public Monitor(String brand, String model, int dimensions) {
        this.brand = brand;
        this.model = model;
        this.dimensions = dimensions;
    }


    public void printInfo() {
        String xx= "Monitor{brand='" + brand + ", model='" + model + ", dimensions=" + dimensions+'}';
        System.out.println(xx);
    }
}
