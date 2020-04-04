package hw11;

public class Airport {
    private Plane plane;
    private Gate gate;

    public Airport(Plane plane, Gate gate) {
        this.plane = plane;
        this.gate = gate;
    }
    public Airport(){

    }
    public void printInfo() {
        String a=("In Manas Airport = " + plane + " + " + gate);
        System.out.println(a);
    }
}
