package hw15;

public class Shirt {
    private String type;
    private String color;

    public Shirt(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printInfo() {
        System.out.println(color + " " + type);
    }
}
