package HW9;

public class App {
    public static void main(String[] args) {
        Car wifecar = new Car();
        wifecar.brand = "Ford";
        wifecar.color = "White";
        wifecar.model = "Explorer";
        wifecar.year = 2016;
        wifecar.price = 24000;

        Car mycar = new Car();
        mycar.price = 68000;
        mycar.year = 2018;
        mycar.brand = "Cadilac";
        mycar.model = "Escalade";
        mycar.color = "Black";

        Cats male = new Cats();
        male.age = 1;
        male.breed = "Ragdoll";
        male.color = "White";
        male.name = "Ponchik";
        male.sex = "male";

        Cats female = new Cats();
        female.sex = "female";
        female.name = "Ava";
        female.color = "Gray";
        female.breed = "Dvornyga";
        female.age = 1.5;

        Cellphone samsung = new Cellphone();
        samsung.brand = "Samsung";
        samsung.color = "pink";
        samsung.model = "S 9";
        samsung.number = 234.567;
        samsung.melody = "LP melody";

        Cellphone iphone = new Cellphone ();
        iphone.melody = "regular melody";
        iphone.number = 234.890;
        iphone.model = "X";
        iphone.color = "black";
        iphone.brand = "Iphone";

        Persons wife = new Persons();
        wife.name = "Ksenia";
        wife.age = 31;
        wife.colorhair = "gray";
        wife.lastname = "Lybimova";
        wife.date = 30;
        wife.months = "may";
        wife.year = 1988;

        Persons me = new Persons();
        me.year = 1984;
        me.lastname = "Maximov";
        me.name = "Denis";
        me.age = 36;
        me.months = "april";
        me.date = 24;
        me.colorhair = "blonde";
        me.months = "april";

        System.out.println("Hello my name is "+ me.name+" and my wife "+ wife.name );
        System.out.println("We do have 2 cats " + female.sex+ " and "+male.sex);
        System.out.println();
        System.out.println("Their names is "+ female.name+ " and "+ male.name );

        if (male.age > female.age){
            System.out.println("Ponchik is older then Ava");
        }else{
            System.out.println("Ava is older then Ponchik");
        }
        female.fins();
        male.jump();

        System.out.println();
        System.out.println(wife.name+ " she have "+samsung.brand+ " model is "+samsung.model+" its "+samsung.color);
        System.out.println("When "+wife.name+ " calling me "+" " +
                "always playing "+iphone.melody+ " but if i calling her "+samsung.melody);
        System.out.println("I driving "+mycar.brand+" "+mycar.model+" , "+ " i bought in "+mycar.year);

        System.out.println();

        System.out.println(wife.name+" start selling her car, ");
        System.out.println("If somebody interesting:");

        wifecar.sell();

    }
}
