package homework.hw12;

public class Chair extends Specifications {
    protected String material;
    protected Color color;

    public Chair(double height, double width, double lenght, double price, String material, Color color) {
        super(height, width, lenght, price);
        this.material = material;
        this.color = color;
    }
}
