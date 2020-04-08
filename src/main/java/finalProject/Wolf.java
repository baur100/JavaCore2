package finalProject;

public class Wolf extends Carnivores implements Life{

    private String name;

    public Wolf(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void canBreath() {

    }

    @Override
    public void consumeFood() {
        System.out.println(name + ""+ "likes to eat meat");

    }


    @Override
    public void die() {
        System.out.println(name + " " + "lives 6-8 years in average.");

    }

    @Override
    public void reproduce() {
        System.out.println(name + " " + "typically has one litter of pups per year.");

    }

    @Override
    public void haveBackbone() {
        System.out.println(name + " " + " is type of vertebrate.");

    }

    @Override
    public void haveHair() {
        System.out.println(name + " "+ "can have a lot of fur.");

    }

    @Override
    public void feedsOnFlesh() {

    }
}
