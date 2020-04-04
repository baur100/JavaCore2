package Homework11;

public class Systemblock {
    private String brand;
    private String processor;
    private int ram;

    public Systemblock(String brand, String processor, int ram) {
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;
    }

    public void printInfo() {
        String xx = " System block: brand - " + brand + ", processor - " + processor + ", RAM - " + ram + "GB.";
        System.out.println(xx);
    }
}
