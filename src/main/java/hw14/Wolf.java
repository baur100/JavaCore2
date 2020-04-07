package hw14;

public class Wolf extends Carnivores{
    private String name;

    public Wolf(String habitat, String classification) {
        super(habitat, classification);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void runSwim() {
        System.out.println(this.getClass().getSimpleName() + " is running");
    }
}
