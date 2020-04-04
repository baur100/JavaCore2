package hw12;

public class Area {
    protected String country;
    protected String state;
    protected int population;

    public Area(String country, String state, int population) {
        this.country = country;
        this.state = state;
        this.population = population;
    }

    public String getName() {
        return country;
    }

    public String getState() {
        return state;
    }

    public int getPopulation() {
        return population;
    }
}
