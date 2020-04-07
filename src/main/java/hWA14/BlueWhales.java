package hWA14;

public class BlueWhales extends Whales{
    private String name;

    public BlueWhales(Area habitat, String name) {
        super(habitat);
        this.name=name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void canSwim() {
        System.out.println("I can swim during long time");

    }

    @Override
    public void longOfHair() {
        System.out.println("I have very chort hairs");

    }

    @Override
    public void howIMove() {
        System.out.println("i can only swim");

    }

    @Override
    public void myNervousSystem() {
        System.out.println("I have spinal cord - i am a vertebrates");

    }

    @Override
    public void canMove() {
        System.out.println("i move very gracious");

    }

    @Override
    public void breath() {
        System.out.println("I breath, then i am out of water");

    }

    @Override
    public void live() {
        System.out.println(" i can live a lot of years, more then peoples");

    }

    @Override
    public void reproduction() {
        System.out.println("type reproduction: viviparous");

    }
    public String toString(){
        return "i am a "+name+ " My habitat is "+habitat;
    }
}
