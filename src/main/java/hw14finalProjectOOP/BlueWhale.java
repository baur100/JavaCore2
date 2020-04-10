package hw14finalProjectOOP;

public class BlueWhale extends Whales implements Mammals, Vertebrates, Animals, Life {
    @Override
    public void eat() {
        super.eat();
        System.out.println("All whales eat plankton.");
    }

    @Override
    public void die() {
        super.die();
        System.out.println("It very sad to see dying Blue Whales");
    }

    @Override
    public void breathe() {
        super.breathe();
        System.out.println("Whales cannot breathe in dirty water.");
    }

    @Override
    public void reproduce() {
        super.reproduce();
        System.out.println("Newborn whale weighs about 3 tons");

    }

    @Override
    public void legs() {
        super.legs();
        System.out.println("And he doesn't have any leg.");
    }

    @Override
    public void chorda() {
        super.chorda();
        System.out.println("He is very long, more than 30 meters in length.");
    }

    @Override
    public void milky() {
        super.milky();
        System.out.println("Mother whale nurses her baby during 7 months.");
    }

    @Override
    public void fountain() {
        System.out.println("You can see when Blue Whale is breathing- he is making the fountain.");

    }
    public void theBiggest () {
        System.out.println("Blue Whale is the biggest animal in the world!");
    }
}
