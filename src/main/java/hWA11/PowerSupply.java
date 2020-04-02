package hWA11;

public class PowerSupply {
    private String brand;
    private int power;

    public PowerSupply(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    public String getBrand() {
        return brand;
    }

    public int getPower() {
        return power;
    }
    public void printInfo(){
        System.out.println("Power Supply{brand=" + brand + ", power=" + power + "}");
    }
}
