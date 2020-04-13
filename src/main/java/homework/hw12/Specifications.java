package homework.hw12;

public class Specifications {
    protected double height;
    protected double width;
    protected double lenght;
    protected double price;

    public Specifications(double height, double width, double lenght, double price) {
        this.height = height;
        this.width = width;
        this.lenght = lenght;
        this.price = price;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
