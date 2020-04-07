package HW15;

import java.util.ArrayList;
import java.util.List;

public class ArrInt {
    public static void main(String[] args) {
        List<Integer> temp = new ArrayList<Integer>();
        temp.add(87);
        temp.add(65);
        temp.add(98);
        temp.add(66);
        temp.add(33);
        System.out.println(temp);
        System.out.println();

        temp.forEach(x-> System.out.println(x));
        System.out.println();

        temp.remove(4);
        temp.remove(0);
        System.out.println(temp);
        System.out.println();

        System.out.println(temp.size());
        System.out.println();

        temp.set(0,11);
        System.out.println(temp);

    }
}
