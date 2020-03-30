package homework.hw9;

public class Wheels {
    public int radius;
    public String tireMake;
    public boolean isTireGood;

    public void replaceTire(){
        if(this.isTireGood == false){
            this.isTireGood = true;
            System.out.println("Tire replaced");
        }
        System.out.println("Tire is good");
    }
}
