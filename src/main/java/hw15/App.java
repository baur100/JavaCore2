package hw15;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

//        Fruits
        List<Fruits>fruits = new ArrayList<>();

        Fruits f1 = new Fruits("Apple", "Sprouts", 94445, 5);
        Fruits f2 = new Fruits("Peach", "Walmart", 92367, 4);
        Fruits f3 = new Fruits("Orange", "Aldi", 90532, 2);
        Fruits f4 = new Fruits("Kiwi", "Market Street", 94255, 4);

        fruits.add(f1);
        fruits.add(f2);
        fruits.add(f3);
        fruits.add(f4);

        System.out.println("I bought a lot of organic fruits: ");

        for (Fruits f:fruits) {
            System.out.println(f.amount + " pounds of " + f.name + " with PLU code " + f.itemCode + " in " + f.supermarket);
        }

        fruits.remove(f4);
        System.out.println(fruits.size());

          fruits.forEach(y-> System.out.println(y.toString()));

//        Classrooms

        List<Classrooms>classrooms = new ArrayList<>();

        Classrooms c1 = new Classrooms(2020, "Math");
        Classrooms c2 = new Classrooms(3030, "English");
        Classrooms c3 = new Classrooms(4040, "Spanish");
        Classrooms c4 = new Classrooms(5050, "Art");

        classrooms.add(c1);
        classrooms.add(c2);
        classrooms.add(c3);
        classrooms.add(c4);
        System.out.println(classrooms.size());

        classrooms.forEach(z-> System.out.println(z.toString()));

        for (Classrooms c:classrooms) {
            System.out.println("Today grade 11B has following class: " + c.getSubject() + "  in classroom number " + c.getNumber());
        }



//        Price

        ArrayList price = new ArrayList(Arrays.asList(4.99, 0.99, 5.99, 3.99, 9.99));

        System.out.println(price.size());
        System.out.println(price.get(2));
        System.out.println(price.toString());

        price.forEach(x-> System.out.println(x.toString()));
    }
}

