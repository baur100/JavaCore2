package hw15_z;

public class Shoes {
    private String shoes;
    private double size;
    private int pairs;

    public Shoes(String shoes, double size, int pairs) {
        this.shoes = shoes;
        this.size = size;
        this.pairs = pairs;
    }

    public Shoes() {

    }

    public String getShoes() {
        return shoes;
    }

    public double getSize() {
        return size;
    }

    public int getPairs() {
        return pairs;
    }

    public void setShoes(String shoes) {
        this.shoes = shoes;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setPairs(int pairs) {
        this.pairs = pairs;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "shoes='" + shoes + '\'' +
                ", size=" + size +
                ", pairs=" + pairs +
                '}';
    }


}
