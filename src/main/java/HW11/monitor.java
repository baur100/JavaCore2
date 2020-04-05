package HW11;

public class monitor {
    private brands brand;
    private String model;
    private int diag;

    public monitor(brands brand, String model, int diag) {
        this.brand = brand;
        this.model = model;
        this.diag = diag;
    }

    public monitor() {
    }


    public void printInfo() {
        System.out.println("Monitor brand " + brand.getName() + ", " +
                "model " + model + ", " +
                "diag " + diag);

    }
}
