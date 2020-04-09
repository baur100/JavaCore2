package homework.hw11;

public class Monitor {
    private Brands brand;
    private double size;

    public Monitor(Brands brand, double size) {
        this.brand = brand;
        this.size = size;
    }

    public void printInfo() {
        System.out.println("---Monitor info---");
        System.out.println("Monitor brand is " + this.brand.toString());
        System.out.println("Monitor size is " + this.size);
    }
}
