package hw15;

import java.util.List;

public class Car{
    private Brand brand;
    private Color color;
    private Fuel fuel;

    public Car(Brand brand, Color color, Fuel fuel) {
        this.brand = brand;
        this.color = color;
        this.fuel = fuel;
    }
    public void printInfo(){
        System.out.println(brand+" "+color+" "+fuel);
    }

    public Car(String toyota, String white, String gas) {
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

}

