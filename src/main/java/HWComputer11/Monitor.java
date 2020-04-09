package HWComputer11;

public class Monitor {
    private String brand;
    private String model;
    private int diag;

    public Monitor(String brand, String model, int diag) {
        this.brand = brand;
        this.model = model;
        this.diag = diag;
    }

    public void printInfo() {
        System.out.println("Brand: "+brand+"\nModel- "+model+","+" Size-"+diag);
    }
}
