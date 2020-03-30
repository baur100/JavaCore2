package homework.hw9;

public class Battery {
    public String make;
    public int charge;
    public int weight;

    public void chargeBattery(){
        if(this.charge >= 100){
            System.out.println("Battery is good");
        } else {
            this.charge = 100;
            System.out.println("Battery is charged");
        }
    }
}
