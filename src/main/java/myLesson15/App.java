package myLesson15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        String[] namesOld = new String[5];

//        namesOld[0] = "James";
//        namesOld[1] = "John";
//        System.out.println(namesOld[0]);

        names.add("Shaun");
        names.add("James");
        names.add("John");
        names.add("Poul");
        names.add("Shaun");
        names.add("Shaun");
        System.out.println(names);

        List<String> colors = new ArrayList<String>(Arrays.asList("Red","Black","Black"));
        System.out.println(colors);

        names.add(0,"David");
        System.out.println(names);
//        System.out.println(names.get(0));
//        System.out.println(names.get(3));
        names.set(3,"Andrew");
        System.out.println(names);

        System.out.println(names.get(3));
//        System.out.println(names.size());
        names.remove(2);
        System.out.println(names);
//        System.out.println(names.get(2));
//        System.out.println(names.size());
        names.remove("Shaun");
//        System.out.println(names.size());
        System.out.println(names);
        System.out.println(names.contains("Shaun"));

        List<Integer> temp = new ArrayList<Integer>(Arrays.asList(7,8,9,8,8,9,9,2));
        System.out.println(temp);

        System.out.println(names.size());

        for (String v:names){
            System.out.println(v);
        }

        names.forEach(x-> System.out.println(x));

        names.forEach(System.out::println);

        List<Person> people = new ArrayList<Person>();
    }
}
