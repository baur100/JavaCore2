package HW15;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

//        так тоже можно
//        List<Person> people = new AbstractList<Person>();
//        var p1 = new Person("Vlad");
//        people.add(p1);


        List<Person> people = new ArrayList<Person>();
        people.add(new Person("Den"));
        people.add(new Person("Anna"));
        people.add(new Person("Sasha"));
        people.add(new Person("Sergey"));
        System.out.println(people.size());
        System.out.println(people);

        System.out.println();
        System.out.println(people.get(0));
        System.out.println();

        people.set(1,new Person("Dmitriy"));
        System.out.println(people.get(1));
        System.out.println();

        people.forEach(x-> System.out.println(x));
    }
}
