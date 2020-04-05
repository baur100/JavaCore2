package hw13;

import java.text.NumberFormat;

public class SeniorPolicy implements Policy {
    public void apply(double price, int quantity) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println();
        System.out.println("Senior Policy was Executed");
        System.out.println("Senior Price: " + formatter.format((price * quantity) * 0.5));
        System.out.println("Senior Discount is 50%");
    };
}
