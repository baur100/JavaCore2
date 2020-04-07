package Lesson15;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        //ArrayList<String> names = new ArrayList<String>(); //old
        List<String> names = new ArrayList<String>(); //new

        String[] namesOld = new String[5];
        names.add("James");
        names.add("John");
        names.add("Poul");
        names.add("Shaun");
        names.add("Shaun");
        System.out.println(names);

        // namesOld[0] = "James";
        // namesOld[1] = "John";
        names.add(0, "David");
        //System.out.println(names.get(0));
        names.set(3, "Andrew");
        //System.out.println(names.get(3));
        // System.out.println(namesOld[0]);
        names.remove(2);
        System.out.println(names);
        //System.out.println(names.get(2));
        System.out.println(names.size());
        names.remove("Shaun");
        System.out.println(names);
        System.out.println(names.contains("Shaun"));
        System.out.println(names.contains("Shaun111"));

        List<Integer> temp = new ArrayList<>();
        System.out.println(names.size());

        for (String v : names) {
            System.out.println(v);//print
        }
        names.forEach(x -> System.out.println(x));//print лямбда
        names.forEach(System.out::println); //print

    }
}
