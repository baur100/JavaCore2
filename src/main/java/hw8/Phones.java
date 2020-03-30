package hw8;

public class Phones {
    public String brand;
    public String model;
    public String color;
    public int memory;
    public double price;

    public void bluetooth() {
        System.out.println("Your " + brand + " " + model + " will be connected via bluetooth");
    }
    public void ringing(){
        System.out.printf(brand+ " is ringing, please pick up the phone");

    }
}

