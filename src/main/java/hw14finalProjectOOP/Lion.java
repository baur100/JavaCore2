package hw14finalProjectOOP;

public class Lion  extends Carnivores implements Mammals, Vertebrates, Animals, Life {
    @Override
    public void eat() {
        super.eat();
        System.out.println("King lion is hungry.");
    }

    @Override
    public void die() {
        super.die();
        System.out.println("The king is dead, long live the king!");
    }

    @Override
    public void breathe() {
        super.breathe();
        System.out.println("Sh-sh-sh, king lion is still breathing.");
    }

    @Override
    public void reproduce() {
        super.reproduce();
        System.out.println("Ooo, lion baby is so cute!");
    }

    @Override
    public void legs() {
        super.legs();
        System.out.println("He has four big and strong legs.");
    }

    @Override
    public void chorda() {
        super.chorda();
        System.out.println("Lion is king of Jungle!");
    }

    @Override
    public void milky() {
        super.milky();
        System.out.println("Baby lion likes milk.");
    }

    @Override
    public void eatFlesh() {
        System.out.println("He wants a lot of fresh meat.");

    }
    public void mane() {
        System.out.println("He has a beautiful mane!");
    }
}
