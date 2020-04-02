package HW11;

public class Processor {
    private String brand;
    private String model;
    private double price;

    public Processor(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public void printInfo(){
        String cc = "Processor {brand = " + brand + ", model " + model + ", price:$" + price + '}';
        System.out.println(cc);

    }
}
