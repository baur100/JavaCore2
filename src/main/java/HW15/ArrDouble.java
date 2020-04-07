package HW15;

import java.util.ArrayList;
import java.util.List;

public class ArrDouble {
    public static void main(String[] args) {
        List<Double> money = new ArrayList<Double>();
        money.add(23.07);
        money.add(45.09);
        money.add(11.09);
        money.add(67.9);
        money.add(9.99);
        System.out.println(money);
        System.out.println();

        money.set(1,44.99);
        money.set(4,66.66);
        System.out.println(money);
        System.out.println();

        money.remove(2);
        money.forEach(x-> System.out.println(x));
    }
}
