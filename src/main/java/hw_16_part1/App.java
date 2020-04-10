package hw_16_part1;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        Map<String,String> names = new HashMap<>();
        names.put("Ronny","McMoore");
        names.put("Dinara","Abdurakhmanova");
        names.put("Samuel","McMoore");
        names.put("Malika", "McMoore");
        names.put("Layla", "McMoore");
        names.put("Isaiah","McMoore");

        System.out.println(names);

        names.replace("Dinara","McMoore");
        System.out.println(names);

        for (Map.Entry<String,String> value : names.entrySet()){
            System.out.println("First name = "+ value.getKey()+", last name = "+value.getValue());
        }

        names.forEach((key,value)->{
            System.out.println("First name = "+ key+", last name = "+value);
        });

        Map<String, Integer> info = new HashMap<>();
        info.put("Ronny", 50);
        info.put("Dinara",40);
        info.put("samuel",14);
        info.put("Malika",10);
        info.put("Layla",5);
        info.put("Isaiah",3);
        System.out.println(info);


        //var person1 = new Family("Ronny",50);
        //var person2 = new Family("Dinara", 40);

    }
}
