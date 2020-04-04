package HW12;

public class Truck extends Car {
    protected String weight;

    public Truck(String brand, String model, int year, int price, String color, String type, String weight) {
        super(brand, model, year, price, color, type);
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Truck{ " +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", weight='" + weight + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
