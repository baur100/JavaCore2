package hw12_1;

public class State extends Area {
    protected String capitol;
    protected String time;

    public State(String country, String state, int population, String capitol, String time) {
        super(country, state, population);
        this.capitol = capitol;
        this.time = time;
    }

    public String getCapitol() {
        return capitol;
    }

    public String getTime() {
        return time;
    }
}
