package hw14;

public class App {
    public static void main(String[] args) {
        Lions lion = new Lions(1,"Lion");
        Wolf wolf =new Wolf("Wolf","white");
        BlueWhale blueWhale = new BlueWhale("Blue whale",3);

        lion.canBreathe();
        lion.canDie();
        lion.canJump();
        lion.canEatMeat();

        wolf.canBreathe();
        wolf.canDie();
        wolf.canHowl();
        wolf.canEatMeat();

        blueWhale.canBreathe();
        blueWhale.canBreed();
        blueWhale.canDie();
        blueWhale.canDive();

    }

}
