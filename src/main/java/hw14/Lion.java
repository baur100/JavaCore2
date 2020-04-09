package hw14;

public class Lion extends Carnivores {
    public int speed;


    @Override
    public String toString() {
        return "=" + speed ;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Lion(int speed) {
        this.speed = speed;

    }

    @Override
    public void produceMilk() {
        System.out.println("  Young cubs drink milk from their mother's teats.");

    }

    @Override
    public void haveBackbone() {
        System.out.println("  Lion's backbone is a gliding joint, allowing the animal to be flexible");

    }

    @Override
    public void name() {
        System.out.println("1) Lion's name is Panthera leo.");

    }

    @Override
    public void canBreathe() {
        System.out.println("  Lion can breathe.");

    }

    @Override
    public void canEat() {
        System.out.println("  Lion eat antelopes, buffaloes, zebras, young elephants, rhinos, hippos, wild hogs, crocodiles and giraffes.");

    }

    @Override
    public void canDo() {
        System.out.println("  Lions usually hunt at night.");

    }

    @Override
    public void canLove() {
        System.out.println("  Lion can have relationships with humans, and love them. ");

    }

    @Override
    public void canEnjoy() {
        System.out.println("  Lion can enjoy.");

    }
}
