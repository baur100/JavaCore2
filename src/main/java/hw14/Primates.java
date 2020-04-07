package hw14;

public abstract class Primates implements Mammals {
    protected String habitat;
    protected String classification;

    public Primates(String habitat, String classification) {
        this.habitat = habitat;
        this.classification = classification;
    }

    public String getHabitat() { return habitat; }

    public String getClassification() { return classification; }

    public void eatFruits() { System.out.println(this.getClass().getSimpleName() + " eats fruits"); }
}
