package hw16_1;

import java.util.HashMap;
import java.util.Map;

public class IntStr_HashMap {
    public static void main(String[] args) {
        //        Создайте 3 HashMap- <String,String>, <Integer,String> и произвольного класса <Class1,Class2> (придумайте сами)
//        добавьте в каждый HashMap по 4 элемента
//        попробуйте методы put/replace/remove/get/foreach

        Map<Integer,String> dob = new HashMap<>();
        dob.put(1987, "Ivanova Maria");
        dob.put(1980,"Petrova Daria");
        dob.put(1999, "Bobby Smith");
        dob.put(2010, "Bruce Lee");
        System.out.println(dob);

        dob.replace(2010,"Granny Smith");
        System.out.println(dob);

        dob.remove(1987);
        System.out.println(dob);
        System.out.println(dob.size());

        for(Map.Entry<Integer, String> dateName: dob.entrySet()){
            System.out.print(dateName.getValue()+" ");
            System.out.println(dateName.getKey());
        }

        for(Integer date:dob.keySet()){
            System.out.println(date);
        }

        for(String name: dob.values()){
            System.out.println(name);
        }

    }
}
