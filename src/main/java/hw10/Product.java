package hw10;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;

public class Product {

    // Class for creating an instance of an object

    private String name = "";
    private double price = 0;
    private double W = 0;
    private double H = 0;
    private double L = 0;
    private NumberFormat formatter = NumberFormat.getCurrencyInstance();

    // Default constructor

    public Product () {
        this.W = 0;
        this.H = 0;
        this.L = 0;
        this.price = 0;
        this.name = "";
    }

    // Constructor for all data fields available for creating a product

    public Product (String name, double price, double W, double H, double L) {
        if (name == "") {
            System.out.println("Name cannot be blank - object was not created");
            return;
        }
        this.name = name;
        this.price = price;
        this.W = W;
        this.H = H;
        this.L = L;
    }

    // Constructor for product name and price only

    public Product (String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Constructor for product name and dimensions only

    public Product (String name, double W, double H, double L) {
        this.name = name;
        this.W = W;
        this.H = H;
        this.L = L;
    }

    // GET and SET for name

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == "") {
            System.out.println("Product name cannot be blank");
            return;
        }
        this.name = name;
    }

    // GET and SET for price

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // GET and SET for Height

    public double getH() {
        return H;
    }

    public void setH(double h) {
        H = h;
    }

    // GET and SET for Length

    public double getL() {
        return L;
    }

    public void setL(double l) {
        L = l;
    }

    // GET and SET for Width

    public double getW() {
        return W;
    }

    public void setW(double w) {
        W = w;
    }

    // Print entire Object

    public void printClass() {
        System.out.println("Product name: " + this.name);
        System.out.println("Price: " + formatter.format(this.price));
        System.out.println("Width: " + this.W + "\"");
        System.out.println("Height: " + this.H + "\"");
        System.out.println("Length: " + this.L + "\"");
        System.out.println("****************************************");
    }

    // Display Product Name and it's Dimensions

    public void productDimension() {
        System.out.println("Product name: " + this.name);
        System.out.println("Width: " + this.W + "\"");
        System.out.println("Height: " + this.H + "\"");
        System.out.println("Length: " + this.L + "\"");
        System.out.println("****************************************");
    }

    // Display Product Name and Price

    public void displayPrice() {
        System.out.println("Product name: " + this.name);
        System.out.println("Price: " + formatter.format(this.price));
        System.out.println("****************************************");
    }
}
