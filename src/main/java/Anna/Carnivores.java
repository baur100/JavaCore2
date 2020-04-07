package Anna;

public abstract class Carnivores implements Mammals {
    protected String habitat;
    protected int haveLegs;

    public Carnivores(String habitat, int haveLegs) {
        this.habitat = habitat;
        this.haveLegs = haveLegs;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getHaveLegs() {
        return haveLegs;
    }

    public void setHaveLegs(int haveLegs) {
        this.haveLegs = haveLegs;
    }

    public abstract void myMeals();

    public void longOfHair(){
        System.out.println(" i have hairs");
    };

}