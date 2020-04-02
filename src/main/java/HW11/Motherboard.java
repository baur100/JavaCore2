package HW11;

public class Motherboard {
    private String brand;
    private String model;
    private double price;

    public Motherboard(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public void printInfo(){
        String cc = "Motherboard {brand = " + brand + ", model " + model + ", price:$" + price + '}';
        System.out.println(cc);
    }
}
