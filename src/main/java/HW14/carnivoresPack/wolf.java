package HW14.carnivoresPack;

public class wolf extends HW14.mammalsPack.carnivores {
    @Override
    public void canLiveBearing() {
        System.out.println("I can live bearing");
    }

    @Override
    public void canCrawl() {
        System.out.println("I can crowl");

    }

    @Override
    public void canMove() {
        System.out.println("I can move");
    }

    @Override
    public void canBreathe() {
        System.out.println("I can breathe");
    }
    public void canBite(){
        System.out.println("I can bite you");
    }
}
