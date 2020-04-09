package hw16;

import java.text.NumberFormat;

public class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return "name = " + name + " price = " + currency.format(price);
    }
}
