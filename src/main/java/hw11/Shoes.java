package hw11;

public class Shoes {
    private String brand;
    private String color;
    private int price;

    public Shoes(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }
    public void printInfo() {
        System.out.println("The color of the shoes is " + color + ", brand is " + brand + ", price is " + price + "$");
    }
}