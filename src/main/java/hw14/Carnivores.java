package hw14;

public abstract class Carnivores implements Mammals {
    protected String habitat;
    protected String classification;

    public Carnivores(String habitat, String classification) {
        this.habitat = habitat;
        this.classification = classification;
    }

    public String getHabitat() { return habitat; }

    public String getClassification() { return classification; }

    public void eatMeat() { System.out.println(this.getClass().getSimpleName() + " eats meat"); }
}
