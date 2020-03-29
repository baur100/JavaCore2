package hWA8;

public class Airplane {
    public String brand;
    public String model;
    public int capacity;
    public int numPassangers;
    public String condition;
    public int price;
    public int numHr;
    public String type;

    public void printInfo(){ System.out.println("Airplane: "+brand+", model:"+model+", Type: "+type+", condition: "+condition); }
    public void commercialInfo(){ System.out.println("Commercia Informatiom of airplane: "+brand+"\nModel:"+model+", Type: "+type+"\nCondition: "+condition+"\n\tPrice: "
    +price); }
    public void technicalInfo(){ System.out.println("Technical Informatiom of airplane: "+brand+"\nModel:"+model+", Type: "+type+"\nCondition: "+condition+
            "\n\tCapacity: " +capacity+" M3 "+", passangers: "+numPassangers+"\nNumbers of Hr of flight: "+numHr); }

}
