package HW11.L11;

public class Breakfast {
    private String Coffee;
    private String Sandwich;
    private double price;

    public Breakfast(String coffee, String sandwich, double price) {
        Coffee = coffee;
        Sandwich = sandwich;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getSandwich() {
        return Sandwich;
    }

    public String getCoffee() {
        return Coffee;
    }



    }

