package myLesson9;

public class Car {
    public String brand;
    public String model;
    public int year;
    public String color;
    public double price;

    public void drive() {
        System.out.println(brand + " " + model + " is driving");
    }

    public void printInfo() {
        System.out.println("\tBrand -> " + brand + "\n\tModel -> " + model + "\n\tYear -> " +
                year + "\n\tColor -> " + color + "\n\tPrice -> " + price);
    }
}
