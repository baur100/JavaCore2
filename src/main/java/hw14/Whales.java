package hw14;

public abstract class Whales implements Mammals {
    protected String habitat;
    protected String classification;

    public Whales(String habitat, String classification) {
        this.habitat = habitat;
        this.classification = classification;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getClassification() {
        return classification;
    }

    public void eatPlankton() {
        System.out.println(this.getClass().getSimpleName() + " eats plankton");
    }
}
