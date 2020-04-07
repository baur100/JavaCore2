package HW15;

import java.util.ArrayList;
import java.util.List;

public class Digital {
    public static void main(String[] args) {
        List<Double> numberd = new ArrayList<>();
        Double[] numberdOld = new Double[5];
        numberd.add(1.1);
        numberd.add(2.2);
        numberd.add(3.3);
        numberd.add(4.4);

        numberdOld[0] = 1.1;
        System.out.println(numberd.get(0));

        numberd.add(4, 5.5);
        numberd.set(3, 6.6);
        numberd.get(2);
        numberd.remove(2.2);

        System.out.println(numberd);

        for (Double v : numberd) {
            System.out.println(v);
        }
        numberd.forEach(x -> System.out.println(x));
        numberd.forEach(System.out::println);

    }
}
