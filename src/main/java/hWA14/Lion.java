package hWA14;

public class Lion extends Carnivores {
    private String name;

    public Lion(Area habitat, boolean haveLegs, String name) {
        super(habitat, haveLegs);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void myMeals() {
        System.out.println("My favorite meal is fresh meat. ");
    }

    @Override
    public void longOfHair() {
        System.out.println(" i have different long of hair ");

    }

    @Override
    public void howIMove() {
        System.out.println("I can rune very fast. ");

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
        return "i am a "+name+ " My habitate is "+habitat+"\nI have legs "+haveLegs;
    }
}
