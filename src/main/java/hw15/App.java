package hw15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> cars= new ArrayList<String>();
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Huynday");
        System.out.println(cars);
        for(String v:cars){
            System.out.println(v);
        }
        cars.add(0,"Ford");
        System.out.println(cars);
        cars.size();
        System.out.println(cars.size());
        cars.remove("Toyota");
        System.out.println(cars);
        cars.remove(3);
        System.out.println(cars);
        cars.clear();
        System.out.println(cars.size());
        System.out.println("**********************");
        List<Integer> ticket=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(ticket);
        System.out.println(ticket.size());
        ticket.add(222);
        ticket.remove(0);
        System.out.println(ticket);
        ticket.remove(5);
        System.out.println(ticket);
        ticket.set(2,555);
        System.out.println(ticket);
        for (Integer x:ticket) {
            System.out.println(x);
        }
        System.out.println("*****************************");

        List<Double> temp=new ArrayList<>(Arrays.asList(33.7,37.1,38.2,39.9));
        System.out.println(temp);
        System.out.println(temp.size());
        temp.add(0,36.6);
        System.out.println(temp);
        System.out.println(temp.size());
        temp.remove(33.7);
        System.out.println(temp);
        System.out.println(temp.size());
        













    }
}
