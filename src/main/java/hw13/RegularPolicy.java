package hw13;

import java.text.NumberFormat;

public class RegularPolicy implements Policy {
    public void apply(double price, int quantity) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println();
        System.out.println("Regular Policy was Executed");
        System.out.println("Regular price: " + formatter.format(price * quantity));
        System.out.println("No discount is applied");
    }
}
