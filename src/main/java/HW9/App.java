package HW9;

public class App {
    public static void main (String[]args){
        var ss = new Phone();
        ss.brand = "Samsung";
        ss.model = "Galaxy S10";
        ss.color = "Black";
        ss.memory = 128;
        ss.weight = 200;
        ss.screenSize = 6.1;
        ss.price = 1000;

        var ap = new Phone();
        ap.brand = "Iphone";
        ap.model = "11 Pro";
        ap.color = "Pink";
        ap.memory = 256;
        ap.weight = 211;
        ap.screenSize = 6.15;
        ap.price = 1150;

        ss.ring();
        ap.ring();
        System.out.println("--------------");
        ap.printInfo();
        System.out.println("--------------");
        ss.printInfo();

        var avatar = new Movie();
        avatar.name = "Avatar";
        avatar.genre = "Fiction";
        avatar.director = "James Cameron";
        avatar.country = "USA";
        avatar.year = 2009;

        var devchata = new Movie();
        devchata.name = "Devchata";
        devchata.genre = "Comedy";
        devchata.director = "Yuri Chulyukin";
        devchata.country = "Russia";
        devchata.year = 1961;

        System.out.println("--------------");
        avatar.show();
        devchata.show();
        System.out.println("--------------");
        avatar.printInfo();
        System.out.println("--------------");
        devchata.printInfo();

        var mojito = new Drink();
        mojito.name = "Mojito";
        mojito.classification = "Contains alcohol";
        mojito.volume = 16;
        mojito.price = 5;
        //mojito.isNotAloud = true;

        var coffee = new Drink();
        coffee.name = "Latte";
        coffee.classification = "Non-alcoholic";
        coffee.volume = 8;
        coffee.price = 3.25;
        //coffee.isNotAloud = false;


        System.out.println("--------------");
        mojito.printInfo();

        System.out.println("--------------");
        coffee.printInfo();

        var britax = new Carseat();
        britax.brand = "Britax";
        britax.model = "B-Safe";
        britax.category = "Infant Car Seat";
        britax.price = 299;

        System.out.println("--------------");
        britax.printInfo();

        var chicco = new Carseat();
        chicco.brand = "Chicco";
        chicco.model = "NextFit";
        chicco.category = "Convertible";
        chicco.price = 250;

        System.out.println("--------------");
        chicco.printInfo();







    }
}
