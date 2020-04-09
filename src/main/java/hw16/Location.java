package hw16;

public class Location {
    private String town;
    private String country;

    public Location(String town, String country) {
        this.town = town;
        this.country = country;
    }

    @Override
    public String toString() {
        return "town = " + town + " country = " + country;
    }
}
