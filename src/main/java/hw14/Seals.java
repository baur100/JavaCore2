package hw14;

public abstract class Seals implements Mammals {
    protected String habitat;
    protected String classification;

    public Seals(String habitat, String classification) {
        this.habitat = habitat;
        this.classification = classification;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getClassification() {
        return classification;
    }

    public void eatFish() {
        System.out.println(this.getClass().getSimpleName() + " eats Fish");
    }

    public void haveFlippers(){
        System.out.println(this.getClass().getSimpleName() + " has flippers");
    }
}
