package hw12;

public class Electronics {
    protected String brand;
    protected String model;
    protected String type;

    public Electronics(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void printInfo() {
        System.out.println("Type = " + type + '\n' + "Brand = " + brand + '\n' + "Model = " + model + '\n');
        System.out.println(new String(new char[48]).replace('\0', '-'));
    }
}
