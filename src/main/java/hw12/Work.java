package hw12;

import org.w3c.dom.ls.LSOutput;

public class Work {
    public static void main(String[] args) {
        Clothing outerwear = new Clothing("Outerwear", "Cotton", 4, 45);
        outerwear.size();

        Dress dress = new Dress ("Dress", "Linen", 6, 80, "Coctail");
        dress.size();

        Pants pants = new Pants ("Pants", "Synthetic", 2, 60, 32);
        pants.size();

        Coat woolCoat = new Coat("Coat", "Wool", 4, 300, "Winter");
        woolCoat.size();

        Eye eye = new Eye("Blue", "Round");
        Head head = new Head ("Oval", eye);
        Body olga = new Body (head, 170, 55);
        System.out.println();
        System.out.println(olga.getHead().getEye().getColor());
        System.out.println(olga.getHead().getEye().getShape());

    }

}