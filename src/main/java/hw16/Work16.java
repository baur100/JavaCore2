package hw16;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class Work16 {
    public static void main(String[] args) {
        Map<String, String> business = new HashMap<>();
        business.put("Sales", "lifeblood");
        business.put("Marketing", "advertising");
        business.put("Finance", "budget");
        business.put("Accounting", "managing");
        System.out.println(business);
        System.out.println(business.size());
        business.replace("Sales", "MONEY");
        System.out.println(business);
        business.remove("Finance");
        System.out.println(business);
        business.get("Sales");
        System.out.println("I like  " + business.get("Sales") + " )) .");
        for (String key : business.keySet()) {
            System.out.println(key);
            for (Map.Entry<String, String> kv : business.entrySet()) {
                System.out.println(kv.getValue());
            }
            Map<Integer, String> tvBest = new HashMap<>();
            tvBest.put(90, "Samsung");
            tvBest.put(2, "LG");
            tvBest.put(950, "Sony");
            tvBest.put(9, "Hisense");
            System.out.println(tvBest);
            tvBest.replace(9, "Toshiba");
            System.out.println("I don't like " + tvBest.replace(9, "Toshiba"));
            tvBest.remove(950, "Sony");
            System.out.println(tvBest);
            tvBest.get(9);
            System.out.println("I never used " + tvBest.get(9));
            for (Map.Entry<Integer, String> tv : tvBest.entrySet()) {
                System.out.println(tv.getValue());
                System.out.println(tv.getKey());
            }
            DayCare d1 = new DayCare("Primrose");
            var d2 = new DayCare("Montessory");
            var d3 = new DayCare("Academic");
            var d4 = new DayCare("Robotic");

            Child c1 = new Child(1.5);
            var c2 = new Child(2.5);
            var c3 = new Child(3.0);
            var c4 = new Child(4.5);

            Map<DayCare, Child> kinder = new HashMap<>();
            kinder.put(d1, c1);
            kinder.put(d2, c2);
            kinder.put(d3, c3);
            kinder.put(d4, c4);
            for (Map.Entry<DayCare, Child> kv : kinder.entrySet()) {
                System.out.println(kv.getKey());
                System.out.println(kv.getValue());
            }
            kinder.remove(d4);
            System.out.println(kinder.size());

            for (DayCare key1 : kinder.keySet()) {
                System.out.println(key1);
            }
            kinder.replace(d1, c3);
            System.out.println(kinder);
            kinder.get(c3);
            System.out.println(kinder.getOrDefault(c3, c3));

        }
    }
}

//Создайте 3 HashMap- <String,String>, <Integer,String> и произвольного класса <Class1,Class2> (придумайте сами)
//        добавьте в каждый HashMap по 4 элемента
//        попробуйте методы put/replace/remove/get/foreach
