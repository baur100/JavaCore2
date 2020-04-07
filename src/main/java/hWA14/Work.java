package hWA14;

public class Work {
    public static void main (String[]args){
        System.out.println("guess who i am??????:");
        Lion lionone= new Lion(Area.SELVA,true,"lion");
        lionone.breath();
        lionone.live();
        lionone.reproduction();
        lionone.howIMove();
        lionone.longOfHair();
        lionone.myMeals();
        lionone.myNervousSystem();
        System.out.println("My name is "+lionone.getName());
        System.out.println(lionone.toString());
        System.out.println("****************");

        System.out.println("guess who i am??????:");
        Wolf newWolf = new Wolf(Area.FOREST,true,"SpyderWolf");
        newWolf.breath();
        newWolf.canMove();
        newWolf.howIMove();
        newWolf.longOfHair();
        newWolf.myMeals();
        newWolf.myNervousSystem();
        newWolf.reproduction();
        System.out.println("My name is "+newWolf.getName());
        System.out.println(newWolf.toString());
        System.out.println("*******************");

        System.out.println("guess who i am??????:");
        BlueWhales superWhales=new BlueWhales(Area.OCEAN,"spyderWhales");
        superWhales.breath();
        superWhales.canMove();
        superWhales.canSwim();
        superWhales.howIMove();
        superWhales.longOfHair();
        superWhales.live();
        superWhales.myNervousSystem();
        superWhales.reproduction();
        System.out.println("My name is "+superWhales.getName());
        System.out.println(superWhales.toString());





    }
}
