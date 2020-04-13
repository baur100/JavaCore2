package homework.hw12;

public class Sofa extends Specifications {
    protected String material;
    protected boolean isSectional;
    protected int sections;
    protected Color color;

    public Sofa(double height, double width, double lenght, double price, String material, boolean isSectional, Color color) {
        super(height, width, lenght, price);
        this.material = material;
        this.isSectional = isSectional;
        this.color = color;
    }

    public Sofa(double height, double width, double lenght, double price, String material, boolean isSectional, int sections, Color color) {
        super(height, width, lenght, price);
        this.material = material;
        this.isSectional = isSectional;
        this.sections = sections;
        this.color = color;
    }
}
