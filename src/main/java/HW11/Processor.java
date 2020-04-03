package HW11;

public class Processor {
    private String brand;

    public Processor(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void printInfo(){
        System.out.println("Processor = "+brand);
    }
}
