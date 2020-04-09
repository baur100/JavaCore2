package HW11;

public class Monitor {
    private String brand;
    private String model;
    private int diagonal;

    public Monitor(String brand, String model, int diagonal) {
        this.brand = brand;
        this.model = model;
        this.diagonal = diagonal;
    }

    public Monitor() {
    }


    public void printInfo() {
        String xx = ("Computer DELL includes: monitor, system block, mouse, keyboard. \nMonitor brand: " + brand + "\nMonitor model: " + model + "\nMonitor diagonal: " + diagonal);
        System.out.println(xx);
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getDiagonal() {
        return diagonal;
    }
}


