package hw14;

public final class Work {
    public static void main(String[] args) {
        Lion lion = new Lion("female", "Africa", 180, 200);
        Wolf wolf = new Wolf("male", "Alaska", 60, 115);
        BlueWhale whale = new BlueWhale("B. m. musculus", 25, 100, 50);

        lion.printInfo();
        lion.canEat();
        lion.canReproduce();
        lion.eatsMostlyMeat();
        lion.Dies();


        System.out.println();
        wolf.printInfo();
        wolf.canBreathe();
        wolf.canEat();
        wolf.isWarmBlooded();
        wolf.canReproduce();
        wolf.eatsMostlyMeat();
        wolf.Dies();

        System.out.println();
        whale.printInfo();
        whale.canEat();
        whale.canReproduce();

    }
}