package Lesson9;

public class Car {
    public String brand;
    public String model;
    public int year;
    public String color;
    public double price;

    public void drive(){
        System.out.println(brand + "" + " is driving");
    }
    public void printInfo(){
        System.out.println("Brand -> " + brand+"\nModel -> " +
                model +"\nYear -> " +year +"\nColor -> " + color + "\nPrice -> " +price);
    }


}