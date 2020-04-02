package hw11;

public class Bag {
    private String brand;
    private String color;
    private int price;

    public Bag(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }
    public void printInfo() {
        System.out.println("The color of the bag is " + color + ", brand is " + brand + ", price is " + price + "$");
    }
}

