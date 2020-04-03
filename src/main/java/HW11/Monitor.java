package HW11;

public class Monitor {
    private brands brand;
    private String model;
    private int diag;

    public Monitor(brands brand, String model, int diag) {
        this.brand = brand;
        this.model = model;
        this.diag = diag;
    }

    public Monitor() {
    }


    public void printInfo() {
        System.out.println("Monitor brand " + brand.getName() + ", " +
                "model " + model + ", " +
                "diag " + diag);

    }
}
