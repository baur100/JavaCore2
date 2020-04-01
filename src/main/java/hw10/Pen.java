package hw10;

import java.util.Arrays;

public class Pen {
    private String inkColor;
    private int nibSize;
    private String penColor;
    private int price;

    public Pen(){}

    public Pen (String inkColor, int nibSize, String penColor, int price) {
        this.inkColor = inkColor;
        this.nibSize = nibSize;
        this.penColor = penColor;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInkColor() {
        return inkColor;
    }

    public void setInkColor(String inkColor) {
        this.inkColor = inkColor;
    }

    public int getNibSize() {
        return nibSize;
    }

    public void setNibSize(int nibSize) {
        this.nibSize = nibSize;
    }

    public String getPenColor() {
        return penColor;
    }

    public void setPenColor(String penColor) {
        this.penColor = penColor;
    }

    public void printClass(){
        System.out.println("\nColor of the pen is " + penColor + "\nInk color is " + inkColor + "\nSize of the nib is "
        + nibSize + "mm" + "\nPrice is $" + price);
    }
}
