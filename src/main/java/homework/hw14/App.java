package homework.hw14;

public class App {
    public static void main(String[] args) {

        var lion = new Lion("this is  lion breed");
        var whale = new BlueWhale();
        var wolf = new Wolf();

        wolf.breath();
        wolf.drinkMilk();
        wolf.eatOtherAnimals();
        wolf.move();
        wolf.haveBones();
        wolf.sleep();

        System.out.println();


        whale.breath();
        whale.drinkMilk();
        whale.eatOtherAnimals();
        whale.haveBones();
        whale.move();
        whale.sleep();


        System.out.println();



        lion.breath();
        lion.sleep();
        lion.drinkMilk();
        lion.eatOtherAnimals();
        lion.haveBones();
        lion.move();

    }
}
