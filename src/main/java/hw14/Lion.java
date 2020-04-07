package hw14;

public class Lion extends Carnivores {

    public Lion(String name, String[] preyType, int age) {
        super(name, preyType, age);
    }



    @Override
    public void printInfo() {
        System.out.println("I`m "+getName()+" and I`m "+getAge()+" years old.");

    }

    @Override
    public void breath() {
        System.out.println("Lions can breath.");
    }

    @Override
    public void eat() {
        System.out.print("Lions eat ");
        for (String prey: preyType){
            System.out.print(prey+", ");
        }
    }

    @Override
    public void die() {
        System.out.println("As all living creatures lions are dying.");
    }

    @Override
    public void reproduce() {
        System.out.println("Lions could have babies.");
    }

    @Override
    public void hunt() {
        System.out.println("Lions don`t hunt alone.");
    }


    @Override
    public void eatMilk() {
        System.out.println("I eat milk when a baby (Lion).");

    }

    @Override
    public void haveSpine() {
        System.out.println("Lions are vertebrates.");

    }
}
