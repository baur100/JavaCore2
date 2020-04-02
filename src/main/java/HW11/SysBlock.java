package HW11;

public class SysBlock {
    private String brand;
    private String model;


    public SysBlock(String brand, String model) {
        this.brand = brand;
        this.model = model;

    }

    public void printInfo() {
        String xx= "Sysblock {brand=" + brand + ", model=" + model +'}';
        System.out.println(xx);
    }
}
