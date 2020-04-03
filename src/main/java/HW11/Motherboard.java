package HW11;

public class Motherboard {
    private String brand;
    private String chipset;
    private String ram;

    public Motherboard(String brand, String chipset, String ram) {
        this.brand = brand;
        this.chipset = chipset;
        this.ram = ram;
    }
    public void printInfo() {
        String xx = "Motherboard{brand=" + brand + ", chipset=" + chipset + ", ram=" + ram + '}';
        System.out.println(xx);
    }
}
