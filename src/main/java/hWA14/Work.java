package hWA14;

public class Work {
    public static void main (String[]args){
        Life lion = new Lion(Area.SELVA, true,"lion");
        lion.breath();
        lion.live();
        lion.reproduction();
        lion.canMove();
        lion.myNervousSystem();
        lion.howIMove();
        lion.longOfHair();
        lion.myMeals();
        System.out.println(lion.toString());



    }
}
