package l14;

public final class App {
    public static void main(String[] args) {
        final int MYAGE = 457;

        Colors car=Colors.WHITE;
        Colors apple = Colors.RED;
        Colors peach = Colors.GREEN;

        Vehicle myCar = new Vehicle(Brand.MAZDA,"626",2018,car);

        String str = "Red";// "RED", "red"

        Integer a1 = 10;
        int a2 = 10;

        Double b1=2.3;
        double b2=2.3;

        Boolean c1 = true;
        boolean c2= true;

        Character d1='w';
        char d2='w';

        Object xx = Colors.WHITE;
        Object xy = myCar;

        Person per = new Student();
        Person per1 = new Teacher();
//      Person per2 = new Person(); - нельзя создавать объект абстрактного класса!!!




//        Person person = new Person();



    }


}
