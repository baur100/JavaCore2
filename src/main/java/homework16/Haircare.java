package homework16;

public class Haircare {
    private String name;
    private String periodity;
    private Double price;

    public Haircare(String name, String periodity, Double price) {
        this.name = name;
        this.periodity = periodity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Haircare{" +
                "name='" + name + '\'' +
                ", periodity='" + periodity + '\'' +
                ", price=" + price +
                '}';
    }
}
