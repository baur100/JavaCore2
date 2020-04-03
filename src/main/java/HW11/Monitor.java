package HW11;

public class Monitor {
    private String brand;
    private String model;
    private int diag;

    public Monitor(String brand, String model, int diag) {
        this.brand = brand;
        this.model = model;
        this.diag = diag;
    }

    public void printInfo() {
        String xx = "Monitor{brand=" + brand + ", model=" + model + ", diag=" + diag + '}';
        System.out.println(xx);
    }
}