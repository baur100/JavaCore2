package L9;

public class App {
    public static void main(String[] args) {
        var xx = new String();
        var arr = new int[10];
        Car car = new Car();
        int x= 5;

        car.brand = "Toyota";
        car.model = "Camry";
        car.color = "Silver";
        car.year = 2015;
        car.price = 13000;

        Car yourcar = new Car();
        yourcar.model="Civic";
        yourcar.brand="Honda";
        yourcar.year = 2018;
        yourcar.price = 18000;
        yourcar.color = "White";

        System.out.println("My new car is "+car.brand+" "+car.model +" "+ car.year);

        Person anna = new Person();
        anna.name="Anna";
        anna.lastName="Ivanova";
        anna.eyeColor="Blue";
        anna.height=102;
        anna.year=2015;

        var boris = new Person();
        boris.name = "Boris";
        boris.lastName = "Petrov";
        boris.year = 2015;
        boris.height = 110;
        boris.eyeColor = "Brown";

        Fruit ff = new Fruit();
        ff.name = "apple";
        ff.color="green";

        var sharik = new Dog();
        sharik.name = "Sharik";
        sharik.age = 2;
        sharik.breed = "Dvorterier";

        Dog lord = new Dog();
        lord.name = "Lord";
        lord.age = 3;
        lord.breed = "Dog";


        if(sharik.age > lord.age){
            System.out.println("Sharik is older");
        }else {
            System.out.println("Lord is older");
        }

//        lord.bark();
//        sharik.bark();

        lord.sleep();
        sharik.bark();

        car.printInfo();
        yourcar.drive();
        anna.printInfo();
    }
}
