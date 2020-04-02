package MyLesson10;

public class App {
    public static void main(String[] args) {
        Dog doggy = new Dog();
        doggy.age = 10;
        doggy.breed = "Laika";
        doggy.name = "Somoed";

        Dog larry = new Dog("Larry", "pug", 5);
        System.out.println(larry.name);

        Dog alice = new Dog("Alissa");

        alice.bark();
        doggy.bark();
        larry.bark();

        House house = new House(900, 2, 1, "Colonial");

        var boat = new Boat("John");
        boat.printName();

        var boat1 = new Boat(50, "Beda", "Vrungel");
        boat1.printName();

        Student valya = new Student();
        valya.setFirstName("Valya");
        System.out.println(valya.getFirstName());
        valya.setLastName("Vetrova");
        valya.setYear(2011256);

        System.out.println(valya.getFirstName());


    }


}
