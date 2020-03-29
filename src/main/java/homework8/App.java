package homework8;

public class App {
    public static void main(String[] args) {

//        WaterHeaters
        WaterHeaters waterheater = new WaterHeaters();
        waterheater.Brand = "Goriacho";
        waterheater.Type = "Gas";
        waterheater.TankCapacity = "40 gal";
        waterheater.Year = 2010;
        waterheater.Voltage = 240;
        waterheater.Price = 339.0;

        WaterHeaters waterheater1= new WaterHeaters();
        waterheater1.Brand = "Ochen Goriacho";
        waterheater1.Type = "Elecric";
        waterheater1.TankCapacity = "50 gal";
        waterheater1.Year = 2015;
        waterheater1.Voltage = 360;
        waterheater1.Price = 500.4;

        System.out.println("Your Waterheater is "+waterheater.Brand+" "+waterheater.Type+" "
                +waterheater.TankCapacity+" Price "+waterheater.Price);
        System.out.println();
        System.out.println("Your Waterheater is "+ waterheater1.Brand+" "+waterheater1.Type+" "
        +waterheater1.TankCapacity+" Price "+waterheater1.Price);

        System.out.println();
//        Houses
        Houses house1 = new Houses();
        house1.Type= "Wood";
        house1.Levels= 2;
        house1.Rooms= 3;
        house1.Bathrooms= 2.0;
        house1.Garage= "no";

        System.out.println("My house made from "+house1.Type+" ,"+house1.Levels+" level(s), with "+house1.Rooms+" rooms and "
                +house1.Bathrooms+" bathrooms");
        System.out.println();

        Houses house2 = new Houses();
        house1.Type= "Concrete";
        house1.Levels= 1;
        house1.Rooms= 4;
        house1.Bathrooms= 2.5;
        house1.Garage= "yes";

        System.out.println("My house made from "+house1.Type+" "+house1.Levels+" level(s), with "+house1.Rooms+
                " room(s) and "+house1.Bathrooms+" bathroom(s)");
        System.out.println();

//        Shoes
        Shoes shoes1 = new Shoes();
        shoes1.brand = "Crocs";
        shoes1.type = "Glocs";
        shoes1.gender = "Male";
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


    }
}
