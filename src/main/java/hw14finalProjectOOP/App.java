package hw14finalProjectOOP;

public class App {
    public static void main(String[] args) {

//      Lion
        Lion lion = new Lion();

        lion.chorda();
        lion.mane();
        lion.legs();
        lion.eat();
        lion.eatFlesh();
        lion.reproduce();
        lion.milky();
        lion.breathe();
        lion.die();

//      Wolf
        Wolf wolf = new Wolf();

        wolf.eat();
        wolf.breathe();
        wolf.legs();
        wolf.die();
        wolf.reproduce();
        wolf.eatFlesh();
        wolf.milky();
        wolf.pack();
        wolf.chorda();

//      BlueWhale
        BlueWhale blueWhale = new BlueWhale();

        blueWhale.theBiggest();
        blueWhale.chorda();
        blueWhale.legs();
        blueWhale.eat();
        blueWhale.reproduce();
        blueWhale.milky();
        blueWhale.fountain();
        blueWhale.breathe();
        blueWhale.die();

    }

}
