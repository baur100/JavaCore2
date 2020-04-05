package homework11;

public class Monitor {
    private String brand;
    private String model;
    private int diag;

    public Monitor(String brand, String model, int diag) {
        this.brand = brand;
        this.model = model;
        this.diag = diag;
    }

//    Setters and Getters


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }

    public int getDiag() {
        return diag;
    }

    public void setDiag(int diag) {
        this.diag = diag;
    }

    public void printInfo() {
        String xx= "Monitorbrand=" + brand + ", model=" + model + ", diag=" + diag +"";
        System.out.println(xx);
    }
}
