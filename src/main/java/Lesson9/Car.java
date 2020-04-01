package Lesson9;

public class Car {

    public String brand;
    public String model;
    public int year;
    public String color;
    public double price;

    public void drive() {
        System.out.println(brand + " " + model + " is driving");
    }

    public void printCarInfo() {
        System.out.println(brand + " " + model + " model is " + color + " color");

    }
}

