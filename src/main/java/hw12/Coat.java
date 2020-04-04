package hw12;

public class Coat extends Clothing {
    private String season;

    public Coat(String type, String material, int size, int price, String season) {
        super(type, material, size, price);
        this.season = season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getSeason() {
        return season;

    }
}
