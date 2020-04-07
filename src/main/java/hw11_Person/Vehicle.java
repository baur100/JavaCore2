package hw11_Person;

public class Vehicle {
    private String model;
    private String make;
    private int year;
    private String color;

    public Vehicle(String model, String make, int year, String color) {
        this.model = model;
        this.make = make;
        this.year = year;
        this.color = color;
    }

    public void printCar(){
        System.out.println("has car: "+model+" "+make+" "+year+" "+color);
    }

}
