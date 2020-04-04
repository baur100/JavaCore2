package HW12;

public class Tractor extends Truck{
    private String massa;

    public Tractor(String brand, String model, int year, int price, String color, String type, String weight, String massa) {
        super(brand, model, year, price, color, type, weight);
        this.massa = massa;
    }

    @Override
    public String toString() {
        return "Tractor{ " +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", massa='" + massa + '\'' +
                ", weight='" + weight + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
