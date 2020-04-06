package homework13;

public class App {
    public static void main(String[] args) {
        var actor= new Actor(25, "comedy", "movie");
        actor.create();
        actor.getPaid();
        actor.perform();

        var mus1= new Musician("piano");
        mus1.printInfo();

        var sin1= new Singer(50);
        sin1.perform();

        Artist m1= mus1;
        mus1.printInfo();
    }
}
