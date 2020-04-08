package hw15;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Animal dog = new Animal("Sharik","pet");
        Animal cat = new Animal("Kitty", "pet");
        Animal wolf = new Animal("Grey Wolf", "wild animal");
        Animal fox = new Animal("Fox", "wild animal");
        Animal lion = new Animal("Lion", "wild animal");

        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.add(wolf);
        animals.add(fox);

        animals.forEach(x-> System.out.println(x.printInfo()));
        System.out.println(animals.size());

       animals.add(2,dog);
       animals.add(1, cat);

        animals.forEach(x-> System.out.println(x.printInfo()));
        System.out.println(animals.size());

        animals.set(2,lion);
        animals.forEach(x-> System.out.println(x.printInfo()));
        System.out.println(animals.size());

        animals.remove(lion);
        animals.forEach(x-> System.out.println(x.printInfo()));
        System.out.println(animals.size());
        System.out.println("****************");

        System.out.println(animals.get(4).printInfo());






    }
}
