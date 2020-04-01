package HW_10;

public class Theatre {
    private String name;
    private int seats;
    private String location;

    public Theatre() {
    }

    public Theatre(String name, int seats, String location) {
        this.name = name;
        this.seats = seats;
        this.location = location;
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
