package l16;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String,String> countries = new HashMap<String, String>();
        countries.put("USA","Washington");
        countries.put("Germany","Berlin");
        countries.put("Bulgaria","Sofia");

        System.out.println(countries);
        System.out.println(countries.size());
        countries.replace("Germany","Bonn");
        System.out.println(countries);
        countries.put("Bulgaria","Tirana");
        countries.put("Albania","Tirana");
        System.out.println(countries);
        System.out.println(countries.get("Germany"));
        System.out.println(countries.get("GermanY"));
        countries.remove("Bulgaria");
        System.out.println(countries);

        for (Map.Entry<String,String> kv:countries.entrySet()){
            System.out.println(kv.getKey());
            System.out.println(kv.getValue());
        }

        for (String key: countries.keySet()){
            System.out.println(key);
        }

        for (String value:countries.values()){
            System.out.println(value);
        }

//        Map<Integer,String> colors= new HashMap<>();
//        colors.put(0,"Red");
//        colors.put(1,"Black");
//        colors.put(2,"Green");
//        colors.get(1);
        Map<String,String> colors = new HashMap<>();
        colors.put("red","apple");
        colors.put("black","coal");
        colors.put("white","snow");
        colors.put("green","apple");

        Map<Person,Job> employ = new HashMap<>();
        employ.put(new Person(),new Job());

    }
}
