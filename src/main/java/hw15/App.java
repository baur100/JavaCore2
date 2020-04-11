package hw15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    public static <fruits> void main(String[] args) {

//        Fruits
        ArrayList fruits = new ArrayList(Arrays.asList("Peach", "Pear","Apple","Kiwi", "Apricot"));

        fruits.add (0, "Orange" );
        fruits.add("Nectarine");
        System.out.println(fruits.get(1));
        fruits.add(0,"Pineapple");
        fruits.set(1,"Strawberry");
        System.out.println(fruits.size());
        fruits.remove(2);
        fruits.add("Blueberry");
        Collections.sort(fruits);
        for (Object i:fruits) {
            System.out.println(i);
        }
//      Numbers

        ArrayList numbers = new ArrayList<>();
        numbers.add(25);
        numbers.add(99);
        numbers.set(1,100);
        numbers.forEach(x-> System.out.println(x));
        numbers.add(1,110);
        numbers.add(66);
        numbers.forEach(System.out::println);
        numbers.remove(2);
        Collections.sort(numbers);
        for (Object j:numbers) {
            System.out.println(j);
        }

//        Price

        List price = new ArrayList(Arrays.asList(4.99, 0.99, 2.99, 5.99, 3.99, 9.99));
        price.size();
        price.remove(3);
        price.set(0, 1.99);
        price.forEach(System.out::println);
        Collections.sort(price);
        for (Object k:price) {
            System.out.println(k);

        }
    }
}
