package homework16;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, String> seas = new HashMap<String,String>();
        seas.put("Turkey", "Black Sea");
        seas.put("Italy", "Adriatic Sea");
        seas.put("Russia", "Black Sea");
        seas.put("Egypt", "Red Sea");
        seas.put("France", "Mediterranean Sea");

        System.out.println(seas);
        System.out.println(seas.size());
        System.out.println( );
        seas.put("Spain", "Mediterranean Sea");
        seas.put("Croatia", "Mediterranean Sea");
        System.out.println(seas);
        System.out.println(seas.get("Turkey"));
        System.out.println(seas.size());
        System.out.println(seas.containsValue("Mediterranean Sea"));
        System.out.println( );
        for (Map.Entry<String, String> kv:seas.entrySet()){
            System.out.println(kv.getKey());
            System.out.println(kv.getValue());
            System.out.println();
        }

        Map<Integer, String> weekdays = new HashMap<Integer, String>();
        weekdays.put(1, "Monday");
        weekdays.put(2, "Tuesday");
        weekdays.put(3, "Wednesday");
        weekdays.put(4, "Thursday");
        System.out.println(weekdays);
        System.out.println(weekdays.size());
        weekdays.remove(3);
        System.out.println(weekdays.size());
        weekdays.replace(1, "Sunday");
        System.out.println(weekdays);

        System.out.println( );
        Map<Haircare, Facecare> selfcare = new HashMap<>();
        selfcare.put(new Haircare("haircut", "once a month", 25.00), new Facecare("mask", "once a week"));
        System.out.println(selfcare);


    }
}
