package Lesson14;

public final class App {
    public static void main(String[] args) {
        final int MYAGE = 457;

        Colors car = Colors.WHITE;
        Colors apple = Colors.RED;
        Colors peach = Colors.GREEN;

        Vehicle myCar = new Vehicle("MAZDA", "626", 2018, car);
        String str = "RED"; //"RED", "red"

        // Wrapper class !!!
        Integer a1 = 10; //class
        int a2 = 10; //primitive type

        Double b1 = 1.5; //class
        double b2 = 3.8; //primitive  type

        Boolean c1 = true; //class
        boolean c2 = true; // primitive type

        Object xx = Colors.WHITE;
        Object xy = myCar;

        //Person per = new Person() - abstract class!!
    }
}