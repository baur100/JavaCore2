package hWA11;

public class MotherBoard {
    private String brand;
    private String model;

    public MotherBoard(String brand, String model) {
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
        System.out.println("MothrBoard{brand=" + brand + ", model=" + model + "}");
    }
}
