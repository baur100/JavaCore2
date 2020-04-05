package hw13;

public class Shampoo implements Cosmetics {
    private String brand;
    private String ingredients;
    private int price;

    public Shampoo(String brand, String ingredients, int price) {
        this.brand = brand;
        this.ingredients = ingredients;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getIngredients() {
        return ingredients;
    }

    public int getPrice() {
        return price;
    }

    public void store() {
        System.out.println("The shelf life is 2 years");
    }

    public void ingredients() {
        System.out.println("The ingredients are the following: " + ingredients);
    }

    public void madeWhere() {
        System.out.println("Made in USA");
    }
}
