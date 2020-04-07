package finalProject;

public class App {
    public static void main(String[] args) {

        Lion lion =new Lion("Mustafa");
        lion.isKing();
        lion.consumeFood();
        lion.canBreath();
        lion.reproduce();
        lion.die();



        Wolf wolf = new Wolf();
        wolf.reproduce();
        wolf.consumeFood();
        wolf.canBreath();
        wolf.die();
        System.out.println();

        BlueWhale blueWhale = new BlueWhale();
        blueWhale.canBreath();
        blueWhale.consumeFood();
        blueWhale.reproduce();
        blueWhale.die();
        System.out.println();

    }
}
