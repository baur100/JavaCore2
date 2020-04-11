package hw16_1;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        System.out.println("----------------------------");
        PCParts build1Name = new PCParts("AMD", "Ryzen 9 3900x");
        PCParts build2Name = new PCParts("AMD", "Ryzen 5 2600X");
        PCParts build3Name = new PCParts("Intel", "Core i9-9900K");
        PCParts build4Name = new PCParts("Intel", "Core i5-9600K");
        Stock build1Price = new Stock(10, 495);
        Stock build2Price = new Stock(8, 190);
        Stock build3Price = new Stock(7, 650);
        Stock build4Price = new Stock(12, 210);

        Map<PCParts, Stock> brands = new HashMap<PCParts, Stock>();
        brands.put(build1Name, build1Price);
        brands.put(build2Name, build2Price);
        brands.put(build3Name, build3Price);
        brands.put(build4Name, build4Price);

        brands.forEach((x, y) -> System.out.println(x + " " + y));

        System.out.println("----------------------------");
        Map<String, String> classes = new HashMap<>();
        classes.put("K1", "Math");
        classes.put("K2", "English");
        classes.put("K3", "History");
        classes.put("PreK", "Art");
        classes.put("K1", "PE");
        System.out.println(classes);
        System.out.println("----------------------------");
        classes.remove("PreK");
        System.out.println("----------------------------");
        System.out.println(classes);
        // Search by Key only
        classes.remove("History");
        System.out.println("----------------------------");
        System.out.println(classes);
        classes.replace("K1", "Math");
        System.out.println("----------------------------");
        System.out.println(classes);
        System.out.println("----------------------------");
        System.out.println(classes.get("K2"));
        System.out.println("----------------------------");
        classes.forEach((x, y) -> System.out.println(x + " " + y));


    }
}
