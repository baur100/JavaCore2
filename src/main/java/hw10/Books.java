package hw10;

import java.util.Arrays;

public class Books {
    private String name;
    private String author;
    private double price;

    public Books() {
    }

    public Books(String author, String name, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printInfo() {
        System.out.println();
        System.out.println("\tAuthor - " + this.author +
                "\n\tBook Name - " + this.name +
                "\n\tPrice - $" + this.price);
    }
}
