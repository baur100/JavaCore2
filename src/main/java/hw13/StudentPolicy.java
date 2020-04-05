package hw13;

import java.text.NumberFormat;

public class StudentPolicy implements Policy {
    public void apply(double price, int quantity) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println();
        System.out.println("Student Policy was Executed");
        System.out.println("Student Price: " + formatter.format((price * quantity) * 0.75));
        System.out.println("Student Discount is 25%");
    }
}
