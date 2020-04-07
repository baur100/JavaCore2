package hw15;

import java.sql.SQLOutput;

public class Shoes {
    private String color;
    private String type;

    public Shoes(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void printInfo() {
        System.out.println(color + " " + type);
    }
}
