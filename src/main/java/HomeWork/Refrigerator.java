package HomeWork;

public class Refrigerator {
    public String brand;
    public String color;
    public int model;
    public int price;

    public void printInfo(){
        System.out.println("Fridge details: " + brand + ", "+ color+ "," + price);

    }

    public void freeze(){
        System.out.println(brand + " has freezing compartment");

    }

    public void makeShoppingList(){
        System.out.println("Latest models of " + brand + " can make shopping list");
    }

    public void makeIce(){
        System.out.println(brand + " can make ice cubes ");

    }

    public void storeFood(){
        System.out.println("We need " + brand + " to keep food fresh");

    }


}
