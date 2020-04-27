package myLesson13;

public class App {
    public static void main(String[] args) {
        Person ivan = new Person(20);
        ivan.breathe();

        Child rose = new Child();

        Human[] h1 = {ivan, rose};

        Human vv = rose;

        DeskLight l333 = new ArmDeskLampWithClamp(25, "Philips",
                "L333", 1);
        DeskLight standart = new DeskLight(32, "Mono", "ST");

        l333.standartEBulb();
        standart.standartEBulb();

        Dog chau = new ChauChau();
        Dog colly = new Colly();

        chau.bark();
        colly.bark();
    }
}
