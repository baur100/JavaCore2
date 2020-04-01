package homework.hw10;

public class Body {
    private int numberOfDoors;
    private String color;

    public Body() {
    }

    public Body(int numberOfDoors, String color) {
        this.numberOfDoors = numberOfDoors;
        this.color = color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void repaint(String color) {
        this.color = color;
        System.out.println("Car body is painted " + color);
    }

    public void printInfo() {
        System.out.println();
        System.out.println("Car body has " + this.numberOfDoors + " doors.");
        System.out.println("Car body is " + this.color + " color");
    }
}
