package hw12;

public class Pants extends Clothing{
    private int length;

    public Pants(String type, String material, int size, int price, int length) {
        super(type, material, size, price);
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
