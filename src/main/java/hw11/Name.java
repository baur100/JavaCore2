package hw11;

public class Name {
    private String brand;
    private String model;

    public Name(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void printInfo() {
        System.out.println("Desktop :\n{" + "Brand = " + brand
                            + "\n" + " Model = " + model + '}');
        System.out.println(App.line);
    }
}
