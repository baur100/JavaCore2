package hw13;

public class Mascara implements Cosmetics{
    private String color;
    private String type;
    private String brand;
    private int price;
    private String ingredients;

    public Mascara(String color, String type, String brand, int price, String ingredients) {
        this.color = color;
        this.type = type;
        this.brand = brand;
        this.price = price;
        this.ingredients = ingredients;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void store() {
        System.out.println("The shelf life is 3 years");
    }

    public void ingredients() {
        System.out.println("The ingredients are the following: " + ingredients);
    }

    public void madeWhere() {
        System.out.println("Made in France");
    }
}
