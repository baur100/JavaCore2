package hw12;

public class Device extends Item {

    public Device(String title, String description, double price, boolean available, int rating, String category) {
        super(title, description, price, available, rating, category, Device.class.getSimpleName());
    }
}
