package hWA11;

public class Cpu_cooler {
    private String type;
    private String brand;

    public Cpu_cooler(String type, String brand) {
        this.type = type;
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }
    public void printInfo(){
        System.out.println("CPU cooler{brand=" + brand + ", type=" + type + "}");
    }
}
