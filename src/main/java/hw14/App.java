package hw14;

public class App {
    public static void main(String[] args) {

        String line = new String(new char[70]).replace('\0', '-');
        // All instances use default constructors
        // Initialize instances

        Lion lion = new Lion("Savanna", "Lion", "Lion");
        Wolf wolf = new Wolf("Forest", "Wolf");
        BlueWhale whale = new BlueWhale("Ocean", "Whale", "BlueWhale");
        Chimp chimp = new Chimp("Jungle", "Monkey", "Chimp");
        Horse horse = new Horse("Valley", "Horse", "Horse");

        // Run different available methods
        // Lion

        lion.eat();
        lion.eatMeat();
        lion.digestInternally();
        lion.haveSpinalCord();
        lion.breath();
        lion.runSwim();
        lion.reproduce();
        lion.die();
        System.out.println(line);

        // Wolf

        wolf.eat();
        wolf.eatMeat();
        wolf.digestInternally();
        wolf.haveSpinalCord();
        wolf.breath();
        wolf.runSwim();
        wolf.reproduce();
        wolf.die();
        System.out.println(line);

        // Chimp

        chimp.eat();
        chimp.eatFruits();
        chimp.digestInternally();
        chimp.haveSpinalCord();
        chimp.breath();
        chimp.runSwim();
        chimp.reproduce();
        chimp.die();
        System.out.println(line);

        // BlueWhale

        whale.eat();
        whale.eatPlankton();
        whale.digestInternally();
        whale.haveSpinalCord();
        whale.breath();
        whale.runSwim();
        whale.reproduce();
        whale.die();
        System.out.println(line);

        // Horse

        horse.eat();
        horse.eatPlants();
        horse.digestInternally();
        horse.haveSpinalCord();
        horse.breath();
        horse.runSwim();
        horse.reproduce();
        horse.die();
        System.out.println(line);

        // Group mammals into Mammals array for ease of iteration
        // and logical grouping

        Mammals[] mammals = {lion, wolf, whale, chimp, horse};

        // Print Hierarchy Levels
        // Iterate through objects and call the printHierarchy method
        // which calls a recursive function getHierarchy (Life interface)

        System.out.println("HIERARCHY LEVELS");
        System.out.println();
        for (Mammals i : mammals) {
            i.printHierarchy();
            System.out.println('\n' + line);
        }
    }
}
