package myLesson11;

public class Monitor {
    private String brand;
    private String model;
    private int size;

    public Monitor(String brand, String model, int size) {
        this.brand = brand;
        this.model = model;
        this.size = size;
    }

    public void printDevInfo() {
        String xx = "Monitor brand - " + brand + ", model - " + model + ", size - " + size + ".";
        System.out.println(xx);
    }
}
