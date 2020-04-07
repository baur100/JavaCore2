package hw14;

public class BlueWhale extends Carnivores  {
    public BlueWhale(String name, String[] preyType, int age) {
        super(name, preyType, age);
    }

    @Override
    public void printInfo() {
        System.out.println("I`m "+getName()+" and I`m "+getAge()+" years old.");
    }

    @Override
    public void eatMilk() {
        System.out.println(getName()+" is a marine mammal.");

    }

    @Override
    public void haveSpine() {
        System.out.println(getName()+" has spine.");

    }

    @Override
    public void hunt() {
        System.out.println(name+" hunts to eat.");

    }

    @Override
    public void breath() {
        System.out.println(name+" can breath too.");

    }

    @Override
    public void eat() {
        System.out.println(name+" eat tiny shrimplike animals called krill.");

    }

    @Override
    public void die() {
        System.out.println("An average "+name+" lives nearly "+getAge()+" years.");

    }

    @Override
    public void reproduce() {
        System.out.println(name+" reaches its maturity at age 10.");

    }
}
