package HW11.L11;

public class Processor {
    private String brand;
    private String model;

    public Processor(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public void printInfo(){
        System.out.println("Processor = " + brand+" "+model);
    }

}
