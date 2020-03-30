package homework.hw9;

public class Body {
    public int numberOfDoors;
    public String color;

    public void repaint(String color){
        this.color = color;
        System.out.println("Car body is painted "+ color);
    }
}
