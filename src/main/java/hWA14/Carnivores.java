package hWA14;

 abstract class Carnivores implements Mammals {
    protected Area habitat;
    protected boolean haveLegs;

    public Carnivores(Area habitat, boolean haveLegs) {
        this.habitat = habitat;
        this.haveLegs = haveLegs;
    }


    public Area getHabitat() {
        return habitat;
    }

    public boolean isHaveLegs() {
        return haveLegs;
    }

    public void myMeals(){
        System.out.println(" my favorite meals is: ");
    };

}
