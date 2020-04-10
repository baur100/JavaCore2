package hw15;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            numbers.add(2);
            numbers.add(16);
            numbers.add(345);
            numbers.add(9);
            numbers.add(15);
            System.out.println(numbers);
            System.out.println();

            numbers.set(1,4);
            numbers.set(2,7);
            System.out.println(numbers);
            System.out.println();

            numbers.remove(2);
            numbers.forEach(x-> System.out.println(x));
        }
    }

