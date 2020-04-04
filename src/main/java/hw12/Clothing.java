package hw12;

public class Clothing extends Item {
    private String size;

    public Clothing(String title, String description, double price, boolean available, int rating, String size, String category) {
        super(title, description, price, available, rating,  category, Clothing.class.getSimpleName());
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
