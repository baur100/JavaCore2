package hw15;

import java.text.NumberFormat;

public class Item {
    private String name;
    private String description;
    private double price;
    private int quantity;

    public Item(String name, String description, double price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void printInfo() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println(this.getClass().getSimpleName() + "\n" +
                            "{" + "\n" +
                            "Name = " + name + '\n' +
                            "Description = " + description + '\n' +
                            "Price = " + formatter.format(price) + '\n' +
                            "Quantity = " + quantity + '\n' +
                            "}\n");
    }
}
