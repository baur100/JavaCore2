package hw16_1;

public class Stock {
    private int count;
    private int price;

    @Override
    public String toString() {
        return "Stock{" +
                "count=" + count +
                ", price=" + price +
                '}';
    }

    public Stock() {
    }

    public Stock(int count, int price) {
        this.count = count;
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
