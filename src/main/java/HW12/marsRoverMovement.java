package HW12;

public class marsRoverMovement extends rearMotor{
    private double distance;

    public marsRoverMovement(String name, double voltage, boolean direction, double distance) {
        super(name, voltage, direction);
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getDistancePower(){
        double distanceSet = distance/power();
        return distanceSet;
    }
}
