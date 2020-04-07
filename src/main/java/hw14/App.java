package hw14;

public class App {
    public static void main(String[] args) {

        String[] lionPrey = new String[]{"ungulates, wildebeests, zebras, buffaloes, giraffes"};
        Carnivores leo = new Lion("Lion",lionPrey, 14);
       //interface LIFE
        leo.breath();
        leo.eat();
        leo.die();
        leo.reproduce();
        //interface Animals
        leo.hunt();
        //Interface Vertebrates
        leo.haveSpine();
        //interface Mammals
        leo.eatMilk();
        //abstract  Carnivores
        leo.printInfo();
        System.out.println("**************************");

        String[] whalePrey = new String[]{"krill, plankton"};
        Carnivores blueWhale = new BlueWhale("Blue Whale", whalePrey, 80);
        //interface LIFE
        blueWhale.breath();
        blueWhale.eat();
        blueWhale.die();
        blueWhale.reproduce();
        //interface Animals
        blueWhale.hunt();
        //Interface Vertebrates
        blueWhale.haveSpine();
        //interface Mammals
        blueWhale.eatMilk();
        //abstract  Carnivores
        blueWhale.printInfo();
        System.out.println("**************************");

        String[] wolfPrey = new String[]{"moose, deer, wild boar, caribou"};
        Carnivores wolf = new Wolf("Wolf", wolfPrey,8);
        //interface LIFE
        wolf.breath();
        wolf.eat();
        wolf.die();
        wolf.reproduce();
        //interface Animals
        wolf.hunt();
        //Interface Vertebrates
        wolf.haveSpine();
        //interface Mammals
        wolf.eatMilk();
        //abstract  Carnivores
        wolf.printInfo();
        System.out.println("**************************");






    }
}
