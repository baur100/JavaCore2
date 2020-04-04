package hw12;

public class Dress extends Clothing {
    private String style;

    public Dress(String type, String material, int size, int price, String style) {
        super(type, material, size, price);
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
