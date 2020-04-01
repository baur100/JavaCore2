package hw10;

import java.util.SortedMap;

public class App {
    public static void main(String[] args) {
        System.out.println("***Student*****");

        Student a=new Student();
         a.setName("Alex");
         a.setGrade(5);
         a.setAge(24);
         a.setLastName("Bush");

         Student b=new Student("Pedro","Antonio",5,25);
         a.printInfo();

         b.printInfo();




        System.out.println();
        System.out.println("*****Car*****");
        System.out.println();

        Car car1=new Car();
        car1.setBrand("Audi");
        car1.setModel("A8");
        car1.setEngine(5.6);
        car1.setPrice(45000);
        car1.setColor("white");

        Car car2=new Car("BMW","M5",3.6, 36000, "Black");

        car1.printClass();
        car2.printClass();
        car1.whatBrand("white","Audi");
//        car1.whatPrice("White", 2019);


        System.out.println();
        System.out.println("***Camera *****");
        System.out.println();

        Camera camera1 = new Camera("Sony","A7II",3100);

        Camera camera2 = new  Camera();
        camera2.setBrand("Canon");
        camera2.setModel("Mark2");
        camera2.setPrice(2000);

        camera1.printClass();
        camera2.printClass();

        camera1.getBrand("nicon","33",90);
        camera1.getBrand("Sony","A7II",3000);








  }
}
