package hw9;

public class Houses {
    public String type;
    public double sqfootage;
    public double price;
    public int room;
    public int floor;
    public int garage;

    public void printInfo(){
        System.out.println("House Type : "+type+"\nSquare feets : "+sqfootage+"\nRooms : "+room+"\nGarage : "+garage);
    }
    public void price(){
        System.out.println("You will pay $"+price+ " for "+type+" "+floor+" floor house with "+garage+" garages");
    }

}
