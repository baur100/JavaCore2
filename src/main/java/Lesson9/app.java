package Lesson9;

public class app {
    public static void main(String[] args) {
        var xx = new String();
        var arr = new int[10];

        Car car = new Car();
        car.brand = "Toyota";
        car.model = "Camry";
        car.color = "Silver";
        car.year = 2015;
        car.price = 13000;

        Car yourcar = new Car();
        yourcar.brand = "Civic";
        yourcar.model = "Honda";
        yourcar.color = "White";
        yourcar.year = 2018;
        yourcar.price = 18000;
        System.out.println("my new car is" + car.brand + " " + car.model + "" + car.year);

        Person anna = new Person();
        anna.name = "Anna";
        anna.lastName = "Anna";
        anna.height = 102;

        var boris = new Person();
        boris.name = "Boris";

        Fruit ff = new Fruit();
        ff.name = "apple";
        ff.color = "green";

        var sharik = new Dog();
        sharik.name = "Sharik";
        sharik.age = 2;

        Dog lord = new Dog();
        lord.name = "Lord";
        lord.age = 3;


        if (sharik.age > lord.age) {
            System.out.println("Sharik older");
        } else {
            System.out.println("Lord is older");
        }
        lord.bark();
        sharik.bark();
        sharik.sleep();

        car.printCarInfo();
        anna.printCarInfo();
    }

}
