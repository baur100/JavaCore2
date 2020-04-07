package hw15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Work {
    public static void main(String[] args) {
        List<String> pets = new ArrayList<String>();
        pets.add("cat");
        pets.add("dog");
        pets.add("hamster");
        pets.add("parrot");
        System.out.println(pets);
        pets.set(3, "goldfish");
        System.out.println(pets);
        pets.remove("cat");
        System.out.println(pets);
        pets.add(2, "snake");
        System.out.println(pets);
        System.out.println(pets.get(0));
        for (String v: pets) {
            System.out.println(v);
        }
        System.out.println(pets.size());

        List<Integer> dumbbells = new ArrayList<Integer>(Arrays.asList(5, 7, 12,15));
        System.out.println(dumbbells);
        dumbbells.set(2, 8);
        System.out.println(dumbbells);
        dumbbells.add(1,10);
        System.out.println(dumbbells);
        dumbbells.remove(2);
        System.out.println(dumbbells);
        System.out.println(dumbbells.get(3));
        dumbbells.forEach(x-> System.out.println(x));
    }
}
