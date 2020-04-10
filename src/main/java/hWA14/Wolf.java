package hWA14;

public class Wolf extends Carnivores{
    private String name;

    public Wolf(Area habitat, boolean haveLegs,String name) {
        super(habitat, haveLegs);
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void myMeals() {
        System.out.println("My favorite meal is fresh rabbits. ");

    }
    @Override
    public void longOfHair() {
        System.out.println(" i have the same long of hair every where ");

    }

    @Override
    public void howIMove()
    {
        System.out.println("I can rune fast ");

    }

    @Override
    public void myNervousSystem() {
        System.out.println(" i have spinal cord and i am vertebral");

    }

    @Override
    public void canMove() {
        System.out.println("I can move fast. ");

    }

    @Override
    public void breath() {
        System.out.println(" I can breath. ");

    }

    @Override
    public void live() {
        System.out.println(" i still a live. ");

    }

    @Override
    public void reproduction() {
        System.out.println("type reproduction: viviparous");

    }
    public String toString(){
        return "i am a "+name+ " My habitat is "+habitat+"\nI have legs "+haveLegs;
    }

}
