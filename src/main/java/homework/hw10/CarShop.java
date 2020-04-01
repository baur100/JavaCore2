package homework.hw10;

public class CarShop {
    public static void main(String[] args) {
        var engine1ServiceDates = new String[]{"12.03.2016", "10.06.2017", "03.15.2020"};
        var engine2ServiceDates = new String[]{"09.07.2002", "03.23.2010", "06.17.2012", "08.18.2019"};
        Engine engine1 = new Engine("Honda", 4.8, 6, 300, true, false, engine1ServiceDates);
        Engine engine2 = new Engine("Toyota", 3.5, 4, 280, false, true, engine2ServiceDates);

        Battery battery1 = new Battery("SomeCompany", 99, 25);
        Battery battery2 = new Battery("Bosch", 100, 20);

        Wheels wheels1 = new Wheels(18, "GoodYear", false);
        Wheels wheels2 = new Wheels(16, "GoodYear", true);

        Body body1 = new Body(2, "white");
        Body body2 = new Body(4, "red");


        System.out.println("\u001B[31m__________________Current state:__________________ \u001B[0m");
        engine1.printInfo("engine1");
        engine2.printInfo("engine2");

        engine1.changeSparkplugs();
        engine2.changeAlternator();

        System.out.println();
        System.out.println("\u001B[32m__________________New state:__________________ \u001B[0m");

        engine1.printInfo("engine1");
        battery1.printInfo();
        wheels1.printInfo();
        body1.printInfo();
        engine2.printInfo("engine2");
        battery2.printInfo();
        wheels2.printInfo();
        body2.printInfo();


    }
}
