package hw14;

public abstract class Rodents implements Mammals {
    protected String habitat;
    protected String classification;

    public Rodents(String habitat, String classification) {
        this.habitat = habitat;
        this.classification = classification;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getClassification() {
        return classification;
    }

    public void eatGrains() {
        System.out.println(this.getClass().getSimpleName() + " eats grains");
    }

    public void commonPests(){
        System.out.println(this.getClass().getSimpleName() + " is a common household pest");
    }
}
