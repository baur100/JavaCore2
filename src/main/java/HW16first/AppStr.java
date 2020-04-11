package HW16first;

import java.util.HashMap;
import java.util.Map;

public class AppStr {
    public static void main(String[] args) {
        Map<String, String> car = new HashMap<>();
        car.put("BMW", "X5");
        car.put("Mercedes", "G550");
        car.put("Toyota", "Prius");
        car.put("Ford", "Explorer");
        System.out.println(car);

        car.replace("BMW", "X1");
        System.out.println(car);

        car.remove("Toyota");
        System.out.println(car);

        System.out.println(car.get("Ford"));

        System.out.println();

        for (Map.Entry<String, String> cr : car.entrySet()) {
            System.out.println(cr.getKey());
            System.out.println(cr.getValue());
        }
        System.out.println();
        for (Map.Entry<String, String> cr : car.entrySet()) {
            System.out.println(cr);
        }
        System.out.println();

        for (String key: car.keySet()){
            System.out.println(key);
        }
        System.out.println();

        for (String value: car.values()){
            System.out.println(value);
        }
    }
}