package myLesson16;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<String, String>();
        countries.put("USA", "Washington");
        countries.put("Germany", "Berlin");
        countries.put("Bulgaria", "Sofia");

        System.out.println(countries);
        System.out.println(countries.size());
        countries.replace("Germany", "Bonn");
        System.out.println(countries);
        System.out.println(countries.containsKey("Russia"));
        countries.put("Bulgaria", "Tirana");
        System.out.println(countries);
        countries.put("Albania", "Tirana");
        System.out.println(countries);
        System.out.println(countries.get("Germany"));
        System.out.println(countries.get("GErmany"));
        countries.remove("Bulgaria");
        System.out.println(countries);

        for (Map.Entry<String, String> kv : countries.entrySet()) {
            System.out.println(kv.getKey());
            System.out.println(kv.getValue());
        }
        System.out.println();

        // Печатаем через Key
        for (String i : countries.keySet()) {
            System.out.println(i);
        }
        System.out.println();

        // Печатаем через Value
        for (String i : countries.values()) {
            System.out.println(i);
        }

        System.out.println();
        Map<Integer, String> colors = new HashMap<>();
        colors.put(0, "Red");
        colors.put(1, "Black");
        colors.put(2, "Green");
        colors.get(1);

        Map<String, String> colors2 = new HashMap<>();
        colors2.put("red", "apple");
        colors2.put("black", "coal");
        colors2.put("white", "snow");
        colors2.put("green", "apple");

        Map<Person, Job> employ = new HashMap<>();
        employ.put(new Person(), new Job());

    }
}
