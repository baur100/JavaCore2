package HW12_task2;

public class Cosmetic {
    protected String brand;
    protected int size;
    protected int price;

    public Cosmetic(String brand, int size, int price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

}
