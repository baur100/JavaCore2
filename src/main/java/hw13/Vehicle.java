package hw13;

import java.text.NumberFormat;

public class Vehicle implements Fuel{
    protected BrakesType brakes;
    protected double price;
    protected String make;
    protected String model;
    protected int seats;

    public Vehicle(BrakesType brakes, double price, String make, String model, int seats) {
        this.brakes = brakes;
        this.price = price;
        this.make = make;
        this.model = model;
        this.seats = seats;
    }

    public void setBrakes(BrakesType brakes) {
        this.brakes = brakes;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getPrice() {
        return price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getSeats() {
        return seats;
    }

    @Override
    public void fuel() {
        System.out.println("\nE85 Unleaded Gas is Used");
    }

    public void applyBrakes() {
        brakes.brake();
    }

    public void printInfo() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println(this.getClass().getSimpleName() + " {" + "\n" +
                            "Make = " + make + "\n" +
                            "Model = " + model + "\n" +
                            "Price = " + formatter.format(price) + "\n" +
                            "Seats = " + seats + "\n" +
                            "}");
    }
}
