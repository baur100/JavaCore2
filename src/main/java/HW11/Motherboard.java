package HW11;

public class Motherboard {
    private String brand;
    private String chipset;
    private int ram;

    public Motherboard(String brand, String chipset, int ram) {
        this.brand = brand;
        this.chipset = chipset;
        this.ram = ram;
    }

    public void printInfo() {
        String xx = "Motherboard{brand =" + brand + ", chipset=" + chipset + ", ram =" + ram + '}';
        System.out.println(xx);
    }
}
