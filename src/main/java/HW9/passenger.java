package HW9;

public class passenger {


    public String name;
    public int age;
    public int gate;
    public String direction;


    public void showDirection(){
        System.out.println("Mr. " + name + " goes to " + direction);

    }

    public void boarding(){
        if (gate != 0){
            System.out.println("Mr. " + name + "please proceed to " + gate + " gate");
        }
        else {
            System.out.println("Mr. " + name + ", flight to " + direction + " cancelled");
        }

    }
}
