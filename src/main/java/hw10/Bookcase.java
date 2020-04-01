package hw10;

import java.util.Arrays;

public class Bookcase {
     private String material;
     private int[] dimensions = new int[3];
     private int price;
     private int a, b, c;

    public Bookcase(String material, int[] dimensions, int price, int a, int b, int c) {
        this.material = material;
        this.dimensions = dimensions;
        this.price = price;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Bookcase(String material, int[] dimentions, int price) {
        this.material = material;
        this.dimensions = dimentions;
        this.price = price;
    }

    public Bookcase() {
    }

    public Bookcase(String material, int price) {
        this.material = material;
        this.price = price;
    }

    public Bookcase(String metal, int i, int price) {
    }

    public int getPrice() {
        return price;
    }

    public int[] getDimensions() {

        return dimensions;
    }

    public String getMaterial() {
        return material;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDimensions(int a, int b, int c) {
//        this.dimensions = dimensions;
        dimensions[0] = a;
        dimensions [1] = b;
        dimensions [2] =c;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public void printClass(){
        System.out.println("\nThe material of this bookcase is " + material + "\nDimensions are " + Arrays.toString(dimensions)
                + " mm" + "\nThe price is " + price + "$");
    }
}
