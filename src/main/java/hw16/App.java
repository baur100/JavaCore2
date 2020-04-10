package hw16;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        Map<String, String> cars = new HashMap<>();
        cars.put("Toyota", "Sienna");
        cars.put("Hyunday", "Sonata");
        cars.put("Ford", "Focus");
        cars.put("MB", "GL350");
        System.out.println(cars);
        System.out.println();

        cars.replace("Toyota", "Camry");
        System.out.println(cars);
        System.out.println();

        cars.remove("Ford");
        System.out.println(cars);
        System.out.println();

        for (Map.Entry<String, String> x : cars.entrySet()) {
            System.out.println(x.getKey());
            System.out.println(x.getValue());
        }
        System.out.println();

        for (String key : cars.keySet()) {
            System.out.println(key);
        }

        System.out.println("************************");

        Map<Integer,String> color = new HashMap<>();
        color.put(1,"Red");
        color.put(2,"green");
        color.put(3,"Black");
        color.put(4,"White");
        System.out.println(color);
        System.out.println();

        color.replace(2,"Green");
        color.remove(4);
        System.out.println(color.size());
        System.out.println(color);
        color.put(55,"Yellow");
        System.out.println(color.keySet());
        System.out.println(color.values());
        System.out.println();

        for (Integer key :color.keySet()) {
            System.out.println(key);

        }
        for (String value: color.values()) {
            System.out.println(value);
        }

            System.out.println("*******************");
            Father father1 = new Father("Ivan","Ivanov");
            Father father2 = new Father("Petya","Ivanov");
            Father father3 = new Father("Vasya","Ivanov");
            Father father4 = new Father("Kolya","Ivanov");

            Mother mother1 = new Mother("Tanya", "Petrova");
            Mother mother2 = new Mother("Sveta", "Petrova");
            Mother mother3 = new Mother("Nina", "Petrova");
            Mother mother4 = new Mother("Valya", "Petrova");

            Map<Father, Mother> family = new HashMap<>();


            family.put(father1, mother1);
            family.put( father2, mother2);
            family.put(father3, mother3);
            family.put(father4,mother4);
        System.out.println(family.size());
        System.out.println(family.get(father1).getName());
        family.replace(father1, mother4);
        System.out.println(family.get(father1).getName());
        System.out.println(family.get(father1).getLastName());




//            System.out.println("+++++++++++");
//        family.put(new Father("Ivan", "Ivanov"), new Mother("Sveta", "Petrova"));
//        family.put(new Father("Petya", "Petrov"), new Mother("Tanya","Petrova"));
//        family.put(new Father("Vasya", "Petrov"), new Mother("Nina","Petrova"));
//        family.put(new Father("Igor", "Petrov"), new Mother("Valya","Petrova"));

        }


    }

