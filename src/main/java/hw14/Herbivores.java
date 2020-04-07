package hw14;

public abstract class Herbivores implements Mammals {
    protected String habitat;
    protected String classification;

    public Herbivores(String habitat, String classification) {
        this.habitat = habitat;
        this.classification = classification;
    }

    public String getClassification() {
        return classification;
    }

    public String getHabitat() {
        return habitat;
    }

    public void eatPlants() {
        System.out.println(this.getClass().getSimpleName() + " eats plants");
    }
}
