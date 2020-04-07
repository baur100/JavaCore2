package hw14;

public class Wolf extends Carnivores {
    public Wolf(String name, String[] preyType, int age) {
        super(name, preyType, age);
    }

    @Override
    public void printInfo() {
        System.out.println("I`m "+name+" and I`m "+getAge()+" years old.");

    }

    @Override
    public void eatMilk() {
        System.out.println(name+" is land mammal.");

    }

    @Override
    public void haveSpine() {
        System.out.println(name+" has spine.");

    }

    @Override
    public void hunt() {
        System.out.println(name+" always hunting.");

    }

    @Override
    public void breath() {
        System.out.println("I can breath.");

    }

    @Override
    public void eat() {
        System.out.println(name+" eats flesh.");

    }

    @Override
    public void die() {
        System.out.println("In the wild an average "+name+" lives nearly "+getAge()+" years.");

    }

    @Override
    public void reproduce() {
        System.out.println(name+" is monogamous animal.");

    }
}
