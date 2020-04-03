package HW11;

public class Color {
    private String color;

    public Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void printInfo(){
        System.out.println("Color = "+ color);
    }
}
