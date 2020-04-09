package hw16_1;

import java.util.HashMap;
import java.util.Map;

public class App {
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

        cars.forEach(x-> System.out.println(x));

    }
}
