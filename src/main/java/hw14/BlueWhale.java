package hw14;

public class BlueWhale extends Carnivores {
private int mass;

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public BlueWhale(int mass) {
        this.mass = mass;

    }


    @Override
    public void produceMilk() {

    }

    @Override
    public void haveBackbone() {

    }

    @Override
    public void name() {
        System.out.println("3) Blue Whale's name is Balaenoptera musculus.");
    }

    @Override
    public void canBreathe() {
        System.out.println("  Blue whales breathe by swimming to the surface of the water.");

    }

    @Override
    public void canEat() {
        System.out.println("  Blue whales eat krill (euphausiids) and copepods.");


    }

    @Override
    public void canDo() {
        System.out.println("  Blue whales feed during the day and rest at night.");

    }

    @Override
    public void canLove() {
        System.out.println("  Blue whales of the world are capable of loving.");

    }

    @Override
    public void canEnjoy() {
        System.out.println("  Blue Whale is the largest animal ever to have lived on earth.");

    }

    @Override
    public String toString() {
        return "  Blue Whale mass = "+ mass+" lbs.";
    }
}
