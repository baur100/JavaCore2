package myLesson14;

public class App {
    public static void main(String[] args) {

        final int MYAGE = 487;

        Colors car = Colors.WHITE;
        Colors apple = Colors.GREEN;
        Colors peach = Colors.GREEN;

        Vehicle myCar = new Vehicle(Brand.TOYOTA, "Camry", 2013, Colors.BLUE);

        String str = "Red"; //"RED", "red"
        Colors str2 = Colors.RED;

        System.out.println(str2);

        Integer a1 = 10;
        int a2 = 10;

        Double b1 = 2.3;
        double b2 = 2.3;

        Boolean c1 = true;
        boolean c2 = true;

        System.out.println(c1.compareTo(c2));

        Object xx = Colors.GREEN;
        Object xy = myCar;

        Person per = new Student();
 //       Person per1 = new Teacher();
//        Person per2 = new Person(); нельзя создавать объекты абстрактного класса
    }
}


