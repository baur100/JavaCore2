package homework.hw12;

public class Table extends Specifications {
    protected String type;
    protected Color color;
    protected int corners;

    public Table(double height, double width, double lenght, double price, String type, Color color, int corners) {
        super(height, width, lenght, price);
        this.type = type;
        this.color = color;
        this.corners = corners;
    }
}
