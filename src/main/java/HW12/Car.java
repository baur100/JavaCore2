package HW12;

public class Car extends Neibor {
    protected String color;
    protected String type;

    public Car(String brand, String model, int year, int price, String color, String type) {
        super(brand, model, year, price);
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Cars {" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
