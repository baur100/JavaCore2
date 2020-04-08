package finalProject;

public class BlueWhale extends Carnivores{
    private String name;

    public BlueWhale(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void canBreath() {
        System.out.println();

    }

    @Override
    public void consumeFood() {
        System.out.println(name+ " "+ "eats copepods.");

    }


    @Override
    public void die() {
        System.out.println(name + " " + "lifespan is 80-90 years.");

    }

    @Override
    public void reproduce() {
        System.out.println(name + " " + "reproduction is via sexual meiosis.");

    }

    @Override
    public void haveBackbone() {
        System.out.println(name + " " + " is marine mammal.");

    }

    @Override
    public void haveHair() {
        System.out.println("Some " + name + " can have hair.");

    }

    @Override
    public void feedsOnFlesh() {

    }
}
