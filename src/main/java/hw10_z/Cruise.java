package hw10_z;

public class Cruise {
    private String destination;
    private int duration;
    private String boatName;

    public Cruise(String destination, int duration, String boatName) {
        this.destination = destination;
        this.duration = duration;
        this.boatName = boatName;
    }

    public String getBoatName() {
        return boatName;
    }

    public int getDuration() {
        return duration;
    }

    public String getDestination() {
        return destination;
    }

    public void setBoatName(String boatName) {
        this.boatName = boatName;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public Cruise(){};
    public void printClass() {
        System.out.println("We are going to " +destination+" for "+duration+ "  days by "+ boatName);

    }

}


