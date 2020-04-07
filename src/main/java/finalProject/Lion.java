package finalProject;

public class Lion extends Carnivores implements Life, Mammals {

    public String name;

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
        System.out.println("I can breath.");

    }

    @Override
    public void consumeFood() {

    }


    @Override
    public void die() {

    }

    @Override
    public void reproduce() {

    }

    public void isKing(){
        System.out.println("I am " + name + " - " + "The king of the jungle!!!");
    }
}
