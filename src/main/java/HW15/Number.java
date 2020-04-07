package HW15;

import java.util.ArrayList;
import java.util.List;

public class Number {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(100);
        number.add(200);
        number.add(300);
        number.add(400);

        number.add(3, 555);
        number.set(2, 444);
        number.remove(1);

        System.out.println(number.get(3));
        System.out.println(number.size());
        System.out.println(number);

        for (Integer v : number) {
            System.out.println(v);
        }
        number.forEach(x -> System.out.println(x));
        number.forEach(System.out::println);
    }
}
