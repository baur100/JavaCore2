package HW16;

import java.util.HashMap;
import java.util.Map;

public class Number1 {
    public static void main(String[] args) {
        Map<Integer, Integer> sportloto = new HashMap<Integer, Integer>();
        sportloto.put(10, 100);
        sportloto.put(20, 200);
        sportloto.put(30, 300);
        sportloto.put(40, 400);

        System.out.println(sportloto.size());
        System.out.println(sportloto.get((30)));
        sportloto.remove(40);
        sportloto.put(20, 222);
        System.out.println(sportloto);

        for (Map.Entry<Integer, Integer> kv : sportloto.entrySet()) {
            System.out.println(kv.getKey());
            System.out.println(kv.getValue());
        }
    }
}
