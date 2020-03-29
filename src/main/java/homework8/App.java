package homework8;

public class App {
    public static void main(String[] args) {

//        WaterHeaters
        WaterHeaters waterheater = new WaterHeaters();
        waterheater.brand = "Goriacho";
        waterheater.type = "Gas";
        waterheater.tankCapacity = "40 gal";
        waterheater.year = 2010;
        waterheater.voltage = 240;
        waterheater.price = 339.0;

        WaterHeaters waterheater1= new WaterHeaters();
        waterheater1.brand = "Ochen Goriacho";
        waterheater1.type = "Elecric";
        waterheater1.tankCapacity = "50 gal";
        waterheater1.year = 2015;
        waterheater1.voltage = 360;
        waterheater1.price = 500.4;

        System.out.println("Your Waterheater is "+waterheater.brand+" "+waterheater.type+" "
                +waterheater.tankCapacity+" Price "+waterheater.price);
        System.out.println();
        System.out.println("Your Waterheater is "+ waterheater1.brand+" "+waterheater1.type+" "
        +waterheater1.tankCapacity+" Price "+waterheater1.price);

        System.out.println();
//        Houses
        Houses house1 = new Houses();
        house1.type= "Wood";
        house1.levels= 2;
        house1.rooms= 3;
        house1.bathrooms= 2.0;
        house1.garage= "no";

        System.out.println("My house made from "+house1.type+" ,"+house1.levels+" level(s), with "+house1.rooms+" rooms and "
                +house1.bathrooms+" bathrooms");
        System.out.println();

        Houses house2 = new Houses();
        house1.type= "Concrete";
        house1.levels= 1;
        house1.rooms= 4;
        house1.bathrooms= 2.5;
        house1.garage= "yes";

        System.out.println("My house made from "+house1.type+" "+house1.levels+" level(s), with "+house1.rooms+
                " room(s) and "+house1.bathrooms+" bathroom(s)");
        System.out.println();

//        Shoes
        Shoes shoes1 = new Shoes();
        shoes1.brand = "Crocs";
        shoes1.type = "Glocs";
        shoes1.gender = "male";
        shoes1.size = 12.5;
        shoes1.color = "white";

        System.out.println("We have just "+shoes1.brand+" "+shoes1.type+" for "+shoes1.gender+" "+shoes1.size+
                " size in "+shoes1.color+" color");

        Shoes shoes2 = new Shoes();

        shoes2.brand ="Nike";
        shoes2.type = "winter";
        shoes2.gender = "female";
        shoes2.color = "pink";
        shoes2.size = 9.0;


        System.out.println();
        System.out.println("We have just "+shoes2.brand+" "+shoes2.type+" for "+shoes2.gender+" "+shoes2.size+
                " size in "+shoes2.color+" color");
        System.out.println();

//      Doors
        InteriorDoors doors = new InteriorDoors();
        doors.type = "wood";
        doors.model = "6 panel";
        doors.size = 32;
        doors.casing = "no";
        doors.hole = "yes";



        System.out.println("Your order is "+doors.type+" "+doors.model+" door "+doors.size+" inch. casing "+doors.casing+
                ", knob hole "+doors.hole);

        System.out.println();

        InteriorDoors doors2 = new InteriorDoors();
        doors2.type = "plastic";
        doors2.model = "flat";
        doors2.hole = "no";
        doors2.casing = "yes";
        doors2.size = 36;

        System.out.println("Your order is "+doors2.type+" "+doors2.model+" door "+doors2.size+" inch. casing "+doors2.casing+
                ", knob hole "+doors2.hole);

        System.out.println();

        if (doors2.size>=doors.size) {
            System.out.println("плоская и пластиковая дверь больше");
        }else {
            System.out.println("деревянная дверб с дыркой для ручки больше");
        }
        System.out.println();

        if (shoes2.gender == "male"){
            System.out.println("Чувак классные ботинки");

        }else
            System.out.println("Чувак сними их они женские");

        System.out.println();

        if (waterheater1.type=="Gas"){
            System.out.println("Эй паря, чем это пахнет у тебя в гараже");

        }else
            System.out.println("Смотри что я придумал возьмись за эти два провода");

        System.out.println();
//      Methods

        house1.casper();
        System.out.println();
        house2.crazyNeighour();
        System.out.println();
        waterheater.oldheater();
        System.out.println();
        waterheater1.leak();
        System.out.println();
        shoes1.corn();
        System.out.println();
        shoes2.fancy();
        System.out.println();
        doors.bam();
        System.out.println();
        doors2.creak();


    }
}
