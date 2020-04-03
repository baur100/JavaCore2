package HW11;

public class Motherboard {
    private String brand;

    public Motherboard(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void printInfo(){
        System.out.println("Motherboard = "+brand);
    }
}
