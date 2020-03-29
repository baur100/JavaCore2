package hw9;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Singer {
    public String name;
    public String genre;
    public int phone;
    public int ticketPrice;

    public void printInfo(){
        System.out.println("Artist Name :"+name+"\nMusic Genre : "+genre+ "\nContact :" +
                +phone+"\nTicket Price : "+ticketPrice);
    }
    public void concert(){
        System.out.println(name +" will be avaible with minimun price as "+ticketPrice+ "per ticket");
    }
    public void price(){
        if(ticketPrice<40){
            System.out.println("good price");
        }else{
            System.out.println("wait for sale");
        }
    }


}
