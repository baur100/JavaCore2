package L15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        String[] namesOld = new String[5];

        names.add("Shaun");
        names.add("James");
        names.add("John");
        names.add("Poul");
        names.add("Shaun");
        System.out.println(names);
        List<String> colors = new ArrayList<String>(Arrays.asList("Red", "Green"));

//        namesOld[0] = "James";
//        namesOld[1] = "John";
        names.add(0,"David");
        System.out.println(names);
//        System.out.println(names.get(0));
        names.set(3,"Andrew");
        System.out.println(names);
//        System.out.println(names.get(3));
        names.remove(2);
        System.out.println(names);
//        System.out.println(namesOld[0]);
//        System.out.println(names.get(2));
        System.out.println(names.size());
        names.remove("Shaun");
        System.out.println(names);
        System.out.println(names.contains("Shaun"));
        System.out.println(names.contains("Freddy"));
        List<Integer> temp = new ArrayList<>();
        System.out.println(names.size());

        for (String v:names) {
            System.out.println(v);
        }

        names.forEach(x-> System.out.println(x));

        names.forEach(System.out::println);

        List<Person> people = new ArrayList<>();

//        ArrayList<Double> xx = null;
//        xx.add(23.6);


    }
}
