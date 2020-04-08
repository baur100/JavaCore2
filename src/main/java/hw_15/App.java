package hw_15;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {


        List<String> weekDays = new ArrayList<String>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        //System.out.println(weekDays.get(0));
        System.out.println(weekDays.size());

        weekDays.add(1,"Saturday");
        weekDays.add(4,"Sunday");

        weekDays.remove(0);
        weekDays.forEach(System.out::println);

        System.out.println(weekDays.size());

        List<Integer> weekEnd = new ArrayList<>();
        weekEnd.add(0);
        weekEnd.add(1);

        List<Boolean> listOfBoolean = new ArrayList<Boolean>();
        listOfBoolean.add(true);
        listOfBoolean.add(false);
        listOfBoolean.forEach(bool->System.out.println("Hello"));
        listOfBoolean.remove(1);
        System.out.println(listOfBoolean.size());
    }
}
