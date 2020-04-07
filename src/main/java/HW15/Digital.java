package HW15;

import java.util.ArrayList;
import java.util.List;

public class Digital {
    public static void main(String[] args) {
        List<Double> numberd = new ArrayList<>();
        numberd.add(1.1);
        numberd.add(2.2);
        numberd.add(3.3);
        numberd.add(4.4);

        numberd.add(4, 5.5);
        numberd.set(3, 6.6);
        numberd.remove(2.2);

        System.out.println(numberd.get(3));
        System.out.println(numberd.size());
        System.out.println(numberd);

        for (Double v : numberd) {
            System.out.println(v);
        }
        numberd.forEach(x -> System.out.println(x));
        numberd.forEach(System.out::println);
    }
}
