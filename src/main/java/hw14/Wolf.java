package hw14;

public class Wolf extends Carnivores {
    private int lifeSpan;

    public Wolf(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    @Override
    public String toString() {
        return "  Wolf's life Span "+lifeSpan+"-8 years";
    }

       public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    @Override
    public void produceMilk() {
        System.out.println("  Female wolves produce milk to feed their cubs");

    }

    @Override
    public void haveBackbone() {
        System.out.println("  Wolf's backbone that serves as a frame for the rest of the body.");

    }

    @Override
    public void name() {
        System.out.println("2) Wolf's name is Least Concern");
    }

    @Override
    public void canBreathe() {
        System.out.println("  Wolf do not hold their breath");

    }

    @Override
    public void canEat() {
        System.out.println("  Wolves are carnivores, which mean they eat meat as their main food source. ");

    }

    @Override
    public void canDo() {
        System.out.println("  Wolves live and hunt in packs of around six to ten animals");

    }

    @Override
    public void canLove() {
        System.out.println("  A wolf-lover is a person who loves wolves so much they cannot love them more!");

    }

    @Override
    public void canEnjoy() {
        System.out.println("  A single wolf is capable of catching and killing a deer unaided");

    }
}
