package HW11;

public class Mouse {
    private String brand;
    private String color;

    public Mouse(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }
    public void mouseprintInfo () {
        System.out.println("Brand: " + brand + "\nColor " + color);
    }


    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
