package hWA8;

public class Boat {
    public String name;
    public int year;
    public int price;
    public String engine;
    public String portName;
    public double tankVolume;
    public double spead;
    public int numPassangers;
    public String type;

    public void printInfo(){System.out.println("Boat: "+name+"\nYear of construction - "+year+"\nEngine: "+engine+"\nPort: "+portName);}
    public void commercialInfo(){System.out.println("Commercial Information:"+"\nBoat: "+name+", Year of construction"+year+", Engine: "+engine+", Price: "+price);}
    public void technicalInfo(){System.out.println("Technical Information:"+"\nBoat: "+name+", Year of construction"+year+", Engine: "+engine+", Volume of tank: "+tankVolume+", Spead: "+spead+" km/h");}
    public void capacityOfBoat(){System.out.println("Boat: "+name+" with Capacity of "+numPassangers+" passangers");}
}
