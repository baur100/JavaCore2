package hw11;

public class Outfit {
    private Dress dress;
    private Shoes shoes;
    private Bag bag;

    public Outfit(Dress dress, Shoes shoes, Bag bag) {
        this.dress = dress;
        this.shoes = shoes;
        this.bag = bag;
    }
    public void printInfo() {
        dress.printInfo();
        shoes.printInfo();
        bag.printInfo();
    }
}
