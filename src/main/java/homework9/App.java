package homework9;

public class App {
    public static void main(String[] args){
        Colaches colaches = new Colaches();

        colaches.savory = "Cheese with brisket";
        colaches.sweet = " Cinnamon";
        colaches.price =  10;

        System.out.println("My favourite colaches are " + "" + colaches.savory + " and" + colaches.sweet + " " + colaches.price);


        Family family = new Family();

        family.sister = "Natasha";
        family.husband = "Gabriel";
        family.daughter = "Eva";
        family.mom = "Tatiana";

        System.out.println("My daughter" + " " + family.daughter + " and my husband" + " " +
                family.husband + " love playing together");
        System.out.println("My daughter" + " " + family.daughter + " misses my sister" + " " +
                family.sister + " and my mom" + " " + family.mom);


        Sport sport = new Sport();

        sport.water = "swimming";
        sport.snow = "skiing";
        sport.indoor = "yoga";

        System.out.println(" \n\tMy favourite sport during summer is" + " " + sport.water +
                " \n\tMy favourite sport during winter is " + sport.snow + " \n\tWhen I am indoor I love " + sport.indoor);


        TableSet tableSet = new TableSet();

        tableSet.color = "brown";
        tableSet.material = "wood";
        tableSet.pieces = 10;
        tableSet.price = 1500;

        System.out.println("My new table set is" + " \nColor -> " + tableSet.color + " \nmaterial -> " +
                tableSet.material + " \npieces -> " + tableSet.pieces + "\nprice -> " + tableSet.price);






    }
}
