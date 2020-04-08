package finalProject;

public class App {
    public static void main(String[] args) {

        Lion lion =new Lion("Lion");
        lion.isKing();
        lion.consumeFood();
        lion.reproduce();
        lion.die();
        lion.haveBackbone();
        lion.haveHair();
        lion.canBreath();
        System.out.println();

        Wolf wolf = new Wolf("Wolf");
        wolf.reproduce();
        wolf.consumeFood();
        wolf.canBreath();
        wolf.die();
        wolf.haveBackbone();
        wolf.haveHair();
        System.out.println();


        BlueWhale blueWhale = new BlueWhale("Blue whale");
        blueWhale.canBreath();
        blueWhale.consumeFood();
        blueWhale.reproduce();
        blueWhale.die();
        blueWhale.haveHair();
        blueWhale.haveBackbone();
        System.out.println();

    }
}
