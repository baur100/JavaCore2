package hw14_FinalProjectOOP.life.animals.vertebrates.mammals.carnivores;

import hw14_FinalProjectOOP.life.animals.vertebrates.mammals.Carnivores;

public class Lion extends Carnivores {
    @Override
    public void meatEater() {
        System.out.println("I am hungry and eat meat");
    }

    @Override
    public void mammaryGlands() {
        System.out.println("I like milk");
    }

    @Override
    public void chordata() {
        System.out.println("And I have a tail");
    }

    @Override
    public void animalia() {
        System.out.println("I am a King of Animals");
    }

    @Override
    public void breathe() {
        System.out.println("I can breath!");
    }

    @Override
    public void eat() {
        System.out.println("Everybody like eating");
    }

    @Override
    public void dead() {
        System.out.println("But sometimes animals are dying");
    }

    @Override
    public void reproduce() {
        System.out.println("My son is Simba");
    }

}
