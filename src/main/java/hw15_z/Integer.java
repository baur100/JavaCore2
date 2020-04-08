package hw15_z;

import java.util.ArrayList;

public class Integer {
    public static void main(String [] args){
        var numbers = new ArrayList<java.lang.Integer>();
        numbers.add(0,10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(555);
        System.out.println("List my numbers "+ numbers);
        int element = numbers.get(1);
        System.out.println("Number under 1 index is "+element);
        numbers.set(4,4);
        System.out.println(numbers);
        numbers.remove(1);
        System.out.println(numbers);
        for (java.lang.Integer n : numbers) {
            System.out.println("I am printing this via using foreach: "+ n);
        }


    }
}
