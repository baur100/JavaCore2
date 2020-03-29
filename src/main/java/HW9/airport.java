package HW9;

public class airport {

    public String name;
    public int rwySize;
    public String fuelType;
    public int terminalCap;


public boolean isAvail(int runwayReq, String fuel, int capacity){
    boolean isAvail;
    if (runwayReq >= rwySize && fuel != fuelType && capacity*4 >= terminalCap){
        System.out.println("Airport " + name + " has no available runway length or fuel or terminal is less then requirements ");
        isAvail = false;
    }
    else {
        System.out.println("Airport " + name + " welcomes you");
        isAvail = true;
    }
    return isAvail;
}

public int gate(String direction, int capacity){
    int gate;
        if (capacity >= 50) {
            gate = 12;
            System.out.println("Airplane to " + direction + " will be departed from gate " + gate);
        } else {
            gate = 2;
            System.out.println("Airplane to " + direction + " will be departed from gate " + gate);
        }
        return gate;
}

}
