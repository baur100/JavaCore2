package hw12;

public class Clothing {
    protected String type;
    protected String material;
    protected int size;
    protected int price;

    public Clothing(String type, String material, int size, int price) {
        this.type = type;
        this.material = material;
        this.size = size;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public int getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    public void size() {
        System.out.println("this is " + type + " of size " + size);
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
