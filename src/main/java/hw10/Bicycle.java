package hw10;

public class Bicycle {
    private String brand;
    private String color;
    private double price;


    public Bicycle(String brand1, String color1, double price1) {
        brand = brand1;
        color = color1;
        price = price1;
    }

    public Bicycle() {
    }


    public void ride() {
        System.out.println("I am riding " + brand + ".");
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        if (price<150){
            System.out.println("Very good price!");
            this.price=1;
        }
        this.price = price;
    }
}
