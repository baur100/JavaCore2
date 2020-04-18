package homework.hw14;

public class Lion extends Carnivores {
    protected String breed;

    public Lion(String breed) {
        this.breed = breed;
    }


    @Override
    public void eatOtherAnimals() {
        System.out.println("Lion eats another animals");

    }

    @Override
    public void drinkMilk() {
        System.out.println("Lion drinks milk");

    }

    @Override
    public void haveBones() {
        System.out.println("Lion has bones");

    }

    @Override
    public void move() {
        System.out.println("Lion is moving");

    }

    @Override
    public void breath() {
        System.out.println("Lion is breathing");

    }

    @Override
    public void sleep() {
        System.out.println("Lion is sleeping");

    }
}
