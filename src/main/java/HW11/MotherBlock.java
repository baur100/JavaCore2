package HW11;

public class MotherBlock {
    private String brand;
    private String model;

    public MotherBlock(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public MotherBlock (){};
    public void MotherBlockprintInfo (){
        System.out.println("Brand: " + brand + "\nModel: " + model);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
