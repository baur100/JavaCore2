package hw15;

import java.util.ArrayList;
import java.util.List;

public class IntArray {
    public static void main(String[] args) {

        //попробуйте методы add/set/remove/get/foreach

        List<Integer> digits = new ArrayList<>();
        digits.add(1);
        digits.add(2);
        digits.add(3);
        digits.add(4);
        System.out.println(digits);
        System.out.println(digits.size());

        digits.add(3,6);
        digits.add(4,6);
        System.out.println(digits);

        digits.remove(3);
        System.out.println(digits);

        System.out.println(digits.get(3));

        digits.set(1, 5);
        System.out.println(digits);

        digits.forEach(d-> System.out.println(d));


    }
}
