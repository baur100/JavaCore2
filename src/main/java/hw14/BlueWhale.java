package hw14;

public class BlueWhale extends Whales {
    private String name;

    public BlueWhale(String habitat, String classification, String name) {
        super(habitat, classification);
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void runSwim() {
        System.out.println(this.getClass().getSimpleName() + " is swimming");
    }
}
