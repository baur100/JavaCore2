package hw15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {

//        Fruits
        List <String> fruits = new ArrayList<>();
        fruits.add("Peach");
        fruits.add("Apple");
        System.out.println(fruits.get(1));
        fruits.add(0,"Pear");
        fruits.set(1,"Kiwi");
        System.out.println(fruits.size());
        fruits.remove(2);
        fruits.add("Apricot");
        Collections.sort(fruits);
        for (String i:fruits) {
            System.out.println(i);
        }
//      Numbers

        List<Integer> numbers = new ArrayList<>();
        numbers.add(25);
        numbers.add(99);
        numbers.set(1,100);
        numbers.forEach(x-> System.out.println(x));
        numbers.add(1,110);
        numbers.add(66);
        numbers.forEach(System.out::println);
        numbers.remove(2);
        Collections.sort(numbers);
        for (Integer j:numbers) {
            System.out.println(j);
        }

//        Price

        List<Double> price = new ArrayList<>(Arrays.asList(4.99, 0.99, 2.99, 5.99, 3.99, 9.99));
        price.size();
        price.remove(3);
        price.set(0, 1.99);
        price.forEach(System.out::println);
        Collections.sort(price);
        for (Double k:price) {
            System.out.println(k);

        }
    }
}
