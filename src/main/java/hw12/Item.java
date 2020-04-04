package hw12;

import java.text.NumberFormat;
import java.util.Currency;

public class Item {
    protected String title;
    protected String description;
    protected double price;
    protected boolean available;
    protected int rating;
    protected String type;
    protected String category;
    private NumberFormat usCurrency = NumberFormat.getCurrencyInstance();

    public Item(String title, String description, double price, boolean available, int rating, String category, String type) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.available = available;
        this.rating = rating;
        this.category = category;
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public int getRating() {
        return rating;
    }

    public String getCategory() {
        return category;
    }

    public void printItem() {
        String line = new String(new char[48]).replace('\0', '-');
        String availability = (available) ? "In Stock" : "Out of Stock";
        System.out.print(type + " { " + '\n' +
                        "Title = " + title + '\n' +
                        "Description = " + description + '\n' +
                        "Category = " + category + '\n' +
                        "Price = " + usCurrency.format(price) + '\n' +
                        "Availability = " + availability + '\n' +
                        "Rating = " + rating + "/10" +  " }" + '\n' + line + '\n');
    }
}
