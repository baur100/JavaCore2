package L10;

public class App {
    public static void main(String[] args) {
//        Dog doggy = new Dog();
//        doggy.age = 10;
//        doggy.breed = "Somoed";
//        doggy.name = "Laika";
//        Dog larry = new Dog("Larry","pug",5);
//        System.out.println(larry.name);
//
//        doggy.bark();
//        larry.bark();
//
//        Dog alice = new Dog("Alisa");
//        alice.bark();

        int[] xx={1,2,1};
        House house = new House(900,2,1,"Colonial", xx);
        house.printHouseInfo();

        var boat = new Boat("John");
        boat.printName();
        boat.owner = "xxx";

        var boat1 = new Boat(50, "Beda", "Vrungel");
        boat1.printName();

        Student valya = new Student();
        valya.setName("Valya");
        valya.setLastname("Vetrova");
        valya.setYear(5000000);

        System.out.println(valya.getName());
    }
}
