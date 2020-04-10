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
            Map<DayCare, Child> kinder = new HashMap<>();
            kinder.put(new DayCare("Primrose"), new Child(1.5));
            kinder.put(new DayCare("Montessory"), new Child(2.5));
            kinder.put(new DayCare("Academic"), new Child(3.0));
            kinder.put(new DayCare("Robotic"), new Child(4.5));
            System.out.println(kinder);
            kinder.replace(new DayCare("Primrose"), new Child(0.6));
            kinder.remove(new DayCare("Montessory"));
            kinder.get(new DayCare("Robotic"));

            for (DayCare key3 : kinder.keySet()) {
                System.out.println(key3);
                for (Child value : kinder.values()) {
                    System.out.println(value);

                }
            }
        }
    }
}








//Создайте 3 HashMap- <String,String>, <Integer,String> и произвольного класса <Class1,Class2> (придумайте сами)
//        добавьте в каждый HashMap по 4 элемента
//        попробуйте методы put/replace/remove/get/foreach
