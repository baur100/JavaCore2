package hw11;

public class Plane {
    private String name;
    private int seat;
    private String country;

    public Plane(String name, int seat, String country) {
        this.name = name;
        this.seat = seat;
        this.country = country;
    }
    public Plane(){

    }

    public String getName() {
        return name;
    }

    public int getSeat() {
        return seat;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Plane " +
                 name + '\'' +
                ", seat=" + seat +
                ", from'" + country + '\''
                ;
    }
}


