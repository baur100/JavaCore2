package hw14finalProjectOOP;

public class Wolf extends Carnivores implements Mammals, Vertebrates, Animals, Life {
    @Override
    public void eat() {
        super.eat();
        System.out.println("Wolf aet Red Hat's Grandma.");
    }

    @Override
    public void die() {
        super.die();
        System.out.println("Then he died.");
    }

    @Override
    public void breathe() {
        super.breathe();
        System.out.println("Wolf cannot breathe because he was too full.");
    }

    @Override
    public void reproduce() {
        super.reproduce();
        System.out.println("Unfortunately, this wolf didn't have his kids.");
    }

    @Override
    public void legs() {
        super.legs();
        System.out.println("Wolf has 4 legs but couldn't run away from hunters.");
    }

    @Override
    public void chorda() {
        super.chorda();
        System.out.println("But Grey Wolf likes to ride princes (Серый Волк и Иван Царевич)");
    }

    @Override
    public void milky() {
        super.milky();
        System.out.println("Baby wolves like to drink milk.");
    }

    @Override
    public void eatFlesh() {
        System.out.println("Adult wolves like fresh lamb.");

    }
    public void pack () {
        System.out.println("The strongest wolf is a pack leader!");
    }
}
