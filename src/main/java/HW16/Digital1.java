package HW16;

import java.util.HashMap;
import java.util.Map;

public class Digital1 {
    public static void main(String[] args) {
        Map<Double, Double> distance = new HashMap<Double, Double>();
        distance.put(1.1, 100.1);
        distance.put(20.2, 200.2);
        distance.put(30.3, 300.3);
        distance.put(40.4, 400.4);

        System.out.println(distance.size());
        System.out.println(distance.get((30.3)));
        distance.remove(40.4);
        distance.put(20.2, 222.2);
        System.out.println(distance);

        for (Map.Entry<Double, Double> kv : distance.entrySet()) {
            System.out.println(kv.getKey());
            System.out.println(kv.getValue());
        }
    }
}