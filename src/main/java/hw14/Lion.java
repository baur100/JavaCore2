package hw14;

public class Lion extends Carnivore {
    private String gender;
    private String from;
    private int weight;
    private int height;

    public Lion(String gender, String from, int weight, int height) {
        this.gender = gender;
        this.from = from;
        this.weight = weight;
        this.height = height;
    }

    public String getGender() {
        return gender;
    }

    public String getFrom() {
        return from;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void eatsMostlyMeat() {
        System.out.println("Preys on a large variety of animals ranging in size from rodents and baboons to Cape (or African) buffalo and hippopotamuses, but they predominantly hunt medium- to large-sized hoofed animals such as wildebeests, zebras, and antelopes. ");
    }

    @Override
    public void isWarmBlooded() {
        System.out.println("A warm blood animal");
    }

    @Override
    public void hasHairOrFur() {
        System.out.println("Has lots of hair");
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
        System.out.println("Can breathe");
    }

    @Override
    public void canEat() {
        System.out.println("Eats meat");
    }

    @Override
    public void canReproduce() {
        System.out.println("Gives birth to 2-4 cubs");
    }

    @Override
    public void Dies() {
        System.out.println("Lives 10-14 years");

    }
    public void printInfo(){
        System.out.println("Lion's gender is " + gender + ", lives in " + from + ", weights " + weight + "kgs, " + height + "cm tall");
    }
}
