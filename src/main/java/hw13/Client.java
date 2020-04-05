package hw13;

import java.text.NumberFormat;
import java.util.Currency;

public class Client {
    private double price;
    private int quantity;
    private Policy policy;

    public Client() {};

    public Client(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void printPrice(Policy policy) {
        policy.apply(price, quantity);
    }
}
