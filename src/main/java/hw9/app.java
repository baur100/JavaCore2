package hw9;

public class app {
    public static void main(String[] args) {
        System.out.println("*******Children******");
        Children child1 = new Children();
        child1.name = "Alex";
        child1.lastName="Petrov";
        child1.age=8;
        child1.sex = "m";

        Children child2=new Children();
        child2.name="Tanya";
        child2.lastName="Ivanova";
        child2.sex="w";
        child2.age = 22;

        child1.printInfo();
        System.out.println();

        child2.sick();
        System.out.println();

        if(child1.age>child2.age){
            System.out.println( child1.lastName+" is older then "+child2.lastName);
        }else{
            System.out.println(child2.lastName+" is older then "+child1.lastName);
        }

        System.out.println("***********Singer**************");
        Singer artist1 = new Singer();
        artist1.name = "Vasya";
        artist1.genre = "rock";
        artist1.ticketPrice = 45;
        artist1.phone = 1178521255;

        Singer artist2 = new Singer();
        artist2.name = "Sveta";
        artist2.genre = "pop";
        artist2.ticketPrice = 50;
        artist2.phone = 1179846514;

        Singer artist3 = new Singer();
        artist3.name = "jass band";
        artist3.genre = "jass";
        artist3.ticketPrice = 80;
        artist3.phone = 1179884684;

        artist1.printInfo();
        System.out.println();
        artist3.concert();
        System.out.println();

        artist1.price();

        if(artist1.ticketPrice<50){
            System.out.println("Please call: "+artist1.phone);
        }else{
            System.out.println(artist1.name+" is not avaible");

            }
        System.out.println("*******Houses********");
        Houses house1=new Houses();
            house1.type ="single";
            house1.price  = 159000;
            house1.floor = 2;
            house1.room = 3;
            house1.sqfootage =1759;
            house1.garage=2;

            house1.printInfo();
        System.out.println();
            house1.price();
        System.out.println();

        Houses house2=new Houses();
        house2.type ="Farm";
        house2.price  = 459000;
        house2.floor = 3;
        house2.room = 6;
        house2.sqfootage =4759;
        house2.garage=4;

        house2.printInfo();
        if(house1.price<200000) {
            System.out.println("want it, make an offer!!!");
        }else {
            System.out.println("too expensive");
        }
        System.out.println("*******Bulb********");

        Bulb small = new Bulb();
        small.watts =40;
        small.color= "white";
        small.voltage= 12;

        Bulb regular=new Bulb();
        regular.voltage=110;
        regular.watts= 100;
        regular.color="bright white";

        small.flashLight();
        small.volts();
        regular.volts();







        }
    }


