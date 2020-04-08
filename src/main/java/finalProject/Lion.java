package finalProject;

public class Lion extends Carnivores {

    private String name;

    public Lion(String name) {
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
        System.out.println();

    }

    @Override
    public void consumeFood() {
        System.out.println(name + " " +"eats meat.");

    }


    @Override
    public void die() {
        System.out.println(name + " " + "can die fighting for food.");

    }

    @Override
    public void reproduce() {
        System.out.println(name + " " + "reproduces just like any other animals.");

    }

    public void isKing(){
        System.out.println(name + " " +"is considered as a King of jungle.");
    }

    @Override
    public void haveBackbone() {
        System.out.println(name + " " + "has spinal column.");

    }


    @Override
    public void haveHair() {
        System.out.println( name + " "+ "has thick and long fur.");

    }

    @Override
    public void feedsOnFlesh() {

    }
}
