package hw10;

import org.w3c.dom.ls.LSOutput;

public class Dress {
    private String type;
    private String color;
    private int size;
    private double price;

    public Dress(){}

    public Dress (String type, String color, int size, double price){
        this.type = type;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void printClass(){
        System.out.println("\nThe color of the dress is " + color + "\nThe type is " + type + "\nThe size is "
            + size + "\nThe price is " + price + "$");
    }
}

