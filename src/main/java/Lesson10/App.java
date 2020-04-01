package Lesson10;

public class App {

    public static void main(String[] args) {
        Dog doggy = new Dog();
        doggy.age = 10;
        doggy.breed = "Samoed";
        doggy.name = "Layka";

        Dog larry = new Dog("Larry", "pug", 5);
        System.out.println(larry.name);

        doggy.bark();
        larry.bark();

        Dog alice = new Dog("Alisa");
        alice.bark();

        House house = new House(900, 2, 1, "City style");
        house.printHouseInfo();

        var boat = new Boat("John");
        boat.printName();
        boat.owner = "xxx";

        var boat1 = new Boat(50, "Pobeda", "Vrungler1");
        boat1.printName();

        Student valya = new Student();
        valya.setName("Valya");
        valya.setLastname("Vetrova");
        valya.setYear(2011);



        System.out.println(valya.getName());

    }
}
