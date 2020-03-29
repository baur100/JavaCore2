package hw9;

public class Bulb {
    public int voltage;
    public int watts;
    public String color;

    public void kitchen (){
        System.out.println(color+" light bullb" +watts+" watts it is good for kitchen light");
    }
    public void flashLight (){
        System.out.println(voltage +"V light bulb will be used for flash light");
    }
    public void volts(){
        if(voltage<24){
            System.out.println("good for flash light");
        }else{
            System.out.println("never try this kind of bulb for flash lights");
            System.out.println(" use for regular light");
        }
    }
}
