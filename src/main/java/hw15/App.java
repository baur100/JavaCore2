package hw15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class App {

    public static void main(String[] args) {
        Random rand = new Random();

        Item item1 = new Item("Camera", "Digital Camera", 3999, 10);
        Item item2 = new Item("Screwdrivere", "Heavy Duty", 20.99, 20);
        Item item3 = new Item("PC", "Workstation", 2000, 2);
        Item item4 = new Item("Speaker", "Active Monitor", 600, 5);

        // Items list
        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);

        for (int i = 0; i < (items.size() - 1); i++){
            items.get(i).printInfo();
        }
        items.set(0, item2);
        items.set(1, item1);

        items.forEach((x) -> x.printInfo());

        // Fill ArrayList with random values

        List<Integer> numbers = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(100));
        }

        numbers.forEach((n) -> System.out.print(n + " "));
        System.out.println();
        Collections.sort(numbers);
        numbers.forEach((n) -> System.out.print(n + " "));
        System.out.println("\n");

        // String ArrayList

        List<String> names = new ArrayList<>(List.of("Mark", "John", "Jennifer", "Joseph", "Carry"));

        names.add("Walter");
        names.add(3, "Albert");
        names.remove("John");
        names.remove(3);

        System.out.println(names + "\n");

        // ArrayList Program Demo
        // Allows to visualize primitive methods like get, set, remove, and add

        ListProgram app = new ListProgram();

        app.getName();
        app.getDescription();
        app.getVersion();

        app.start();
    }
}
