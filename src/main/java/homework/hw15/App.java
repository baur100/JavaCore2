package homework.hw15;

import com.google.common.collect.ArrayListMultimap;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        var list1 = new ArrayList<String>();
        list1.add("Louisville");
        list1.add("Lexington");
        list1.add("Richmond");

        System.out.println(list1);

        var list2 = new ArrayList<Integer>();
        list2.add(1995);
        list2.add(2009);
        list2.add(2020);
        System.out.println(list2);

        list2.set(1,3333);
        System.out.println(list2);
        System.out.println(list2.get(2));

        var list3 = new ArrayList<String>();
        list3.add("San Francisco");
        list3.add("Los Angeles");
        list3.add("Pasadena");


        var citiesInDifferentStates = new Cities(list1, list3);
        var cities = new ArrayList<Cities>();
        cities.add(citiesInDifferentStates);
        // prints second city in the second list from Arraylist of classes
        System.out.println(cities.get(0).getState2().get(1));
        // prints second character from the first list from arraylist of classes
        cities.forEach(x->x.getState1().forEach(y-> System.out.println(y.charAt(1))));


    }
}
