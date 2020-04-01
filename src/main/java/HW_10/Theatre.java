package HW_10;

public class Theatre {
    private String name;
    private int seats;
    private String location;
    private String [] performance;

    public Theatre() {
    }


    public Theatre(String name, int seats, String location, String [] performance) {
        this.name = name;
        this.seats = seats;
        this.location = location;
        this.performance = performance;

    }

    public String[] getPerformance() {
        return performance;
    }

    public void setPerformance(String[] performance) {
        this.performance = performance;
    }

    public String getName() {
        return name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSeats() {
        return seats;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void printClass() {

        System.out.println(name + "; " + seats + "seats; " + " " + location);

    }
}
