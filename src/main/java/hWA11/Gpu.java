package hWA11;

public class Gpu {
    private String brand;
    private String model;

    public Gpu(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
    public void printInfo(){
        System.out.println("GPU{brand=" + brand + ", model=" + model + "}");
    }
}
