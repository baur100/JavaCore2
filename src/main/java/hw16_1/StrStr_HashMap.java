package hw16_1;

import java.util.HashMap;
import java.util.Map;

public class StrStr_HashMap {
    public static void main(String[] args) {
//        Создайте 3 HashMap- <String,String>, <Integer,String> и произвольного класса <Class1,Class2> (придумайте сами)
//        добавьте в каждый HashMap по 4 элемента
//        попробуйте методы put/replace/remove/get/foreach

        Map<String, String> cars = new HashMap<>();
        cars.put("Corolla", "Toyota");
        cars.put("Civic", "Honda");
        cars.put("Elantra", "Huyndai");
        cars.put("Rio", "Kia");
        System.out.println(cars);

        System.out.println(cars.size());
        cars.put("Focus", "Ford");
        System.out.println(cars);

        cars.replace("Rio", "Kia", "Mitsubishi");
        System.out.println(cars);

        cars.replace("Rio", "Kia");
        System.out.println(cars);

        cars.put("Prius", "Corolla");
        System.out.println(cars);
        cars.remove("Prius");
        System.out.println(cars);

        for(String key:cars.keySet()){
            System.out.println(key);
        }
        System.out.println();

        for(String value:cars.values()){
            System.out.println(value);
        }
        System.out.println();

        for(Map.Entry<String,String> keyValue: cars.entrySet()){
            System.out.println(keyValue.getKey());
            System.out.println(keyValue.getValue());
        }





    }
}
