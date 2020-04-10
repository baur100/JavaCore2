package hWA11;

public class Prosessor {
    private String brand;
    private String model;

    public Prosessor(String brand, String model) {
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
        System.out.println("Prosessor{brand=" + brand + ", model=" + model +"}");
    }
}
