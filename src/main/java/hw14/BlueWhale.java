package hw14;

public class BlueWhale extends Carnivore {
    private String subspecies;
    private int length;
    private int weight;
    private int age;

    public BlueWhale(String subspecies, int length, int weight, int age) {
        this.subspecies = subspecies;
        this.length = length;
        this.weight = weight;
        this.age = age;
    }

    public String getSubspecies() {
        return subspecies;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void eatsMostlyMeat() {

    }

    @Override
    public void isWarmBlooded() {

    }

    @Override
    public void hasHairOrFur() {

    }

    @Override
    public void has4ChamberedHears() {

    }

    @Override
    public void hasMammaryGlands() {

    }

    @Override
    public void hasSweatGlands() {

    }

    @Override
    public void hasSkeletalStructure() {

    }

    @Override
    public void isHeterotroph() {

    }

    @Override
    public void canBreathe() {

    }

    @Override
    public void canEat() {
        System.out.println("The blue whale diet consists almost exclusively of euphausiids (krill)");
    }

    @Override
    public void canReproduce() {
        System.out.println("Gestation lasts 10-11 months");
    }

    @Override
    public void Dies() {

    }
    public void printInfo(){
        System.out.println("The Blue whale's subspecies is " + subspecies + ", the length is " + length + " meters, weighs " + weight
        + " tons, " + age + " years old");
    }
}
