package hWA14;

 public abstract class Carnivores implements Mammals {
    protected Area habitat;
    protected boolean haveLegs;

     public Carnivores(Area habitat, boolean haveLegs) {
         this.habitat = habitat;
         this.haveLegs = haveLegs;
     }


     public boolean getHaveLegs() {
         return haveLegs;
     }

     public Area getHabitat() {
         return habitat;
     }

     public void setHabitat(Area habitat) {
         this.habitat = habitat;
     }

     public void setHaveLegs(boolean haveLegs) {
         this.haveLegs = haveLegs;
     }

     public abstract void myMeals();

     public void longOfHair(){
         System.out.println(" i have hairs");
     };

}
