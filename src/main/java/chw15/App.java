package chw15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        var p1 = new Person("Vlad");
        people.add(p1);

        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Banana"));
        fruits.add(new Fruit("Apple"));

        Map<Person,Fruit> iLoveFruit = new HashMap<>();
        iLoveFruit.put(new Person("Ivan"),new Fruit("Peach"));


    }
}
