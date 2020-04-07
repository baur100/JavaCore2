package hw14;

public class Lion extends Carnivores{
    private String name;

    public Lion(String habitat, String classification, String name) {
        super(habitat, classification);
        this.name = name;
    }

    public void setName(String name) { this.name = name; }

    public String getName() { return name; }

    @Override
    public void runSwim() {
        System.out.println(this.getClass().getSimpleName() + " is running");
    }
}
