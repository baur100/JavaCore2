package hw15;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
                names.add("James");
                names.add("John");
                names.add("Paul");
                names.add("Shawn");
                names.add("Shawn");


                names.add(0,"David");
                names.set(3,"Andrew");
        names.remove(2);
        names.remove("Shawn");
        System.out.println(names.get(0));
        System.out.println(names.size());
//        System.out.println(names.get(3));
        System.out.println(names.get(2));
        System.out.println(names);


    }
}
