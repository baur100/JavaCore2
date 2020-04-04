package Lesson9;
public class LS9 {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Toyota";
        car.model = "Camry";
        car.color = "Blue";
        car.year = 2020;
        car.price = 25000;

        Car yourcar = new Car();
        car.model = "X5";
        car.brand = "BMW";
        car.year = 2020;

        Person anna = new Person();
        anna.name = "Kara";
        anna.lastname = "Pola";
        anna.height =175;
        anna.year =1989;
        anna.yeucolor = "Blue";

        var boris = new Person();
        boris.name = "Boris";
        boris.year = 1980;

        Fruit aa = new Fruit();
        aa.name = "Apple";
        aa.name = "Green";

        Dog sharik = new Dog();
        sharik.name = "Patrik";
        sharik.age = 7;
        sharik.breed = "Doberman";

        Dog mimi = new Dog();
        mimi.name = "Mimi";
        mimi.age = 1;
        mimi.breed = "Pudel";





        System.out.println("My new car is "+car.brand+" "+car.model+" "+car.year);
        System.out.println("My another car " +yourcar.brand);

        if ( sharik.age > mimi.age) {
            System.out.println("Patrik is older");
        }else{
            System.out.println("Mimi is younger");
        }
        mimi.bark();
        sharik.sleep();

    }
}
