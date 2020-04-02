package hw11_z;

public class App {
    public static void main(String[] args){
        Listening property=new Listening("House","Single Family",98001,"For sale");
        Realtor realtor = new Realtor("Kate","Wallis",4253456781l,"123A23","Great Seattle",property);
      realtor.getListening().printListening();
    }
}
