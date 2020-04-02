package hw11;

public class Dress {
    private String type;
    private String color;
    private int size;
    private double price;

    public Dress(String type, String color, int size, double price) {
        this.type = type;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public void printInfo() {
        System.out.println("The color of the dress is " + color + ", type is " + type + ", size is "
                + size + ", price is " + price + "$");
    }
}