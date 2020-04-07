package HW15;

import java.util.ArrayList;
import java.util.List;

public class ArrString {
    public static void main(String[] args) {
        List<String> friuts= new ArrayList<String>();
        friuts.add("Apple");
        friuts.add("Peach");
        friuts.add("Waterlemon");
        friuts.add("Banan");
        System.out.println(friuts);
        System.out.println();

        friuts.set(1,"Lemon");
        friuts.set(3,"Abricot");
        System.out.println(friuts);
        System.out.println();

        friuts.remove(1);
        System.out.println(friuts);
        System.out.println();

        System.out.println(friuts.get(0));
        System.out.println();

        friuts.forEach(x-> System.out.println(x));


    }
}
