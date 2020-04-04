package hw12;

public class App {

    @Override
    public String toString() {
        return "App{}";
    }

    public static void main(String[] args) {

        Area area = new Area("US", "CA", 40_000_000);
        State state = new State(area.country, area.state, area.population, "Sacramento", "PST");
        City city = new City(area.country, area.state, area.population, state.capitol, state.time, "Los Angeles Metropolian",
                "Christina L. Shea");
        County orangeCounty = new County(area.country, area.state, area.population, state.capitol, state.time,
                city.metropolia, city.mayor, "Orange County", "92614");
        County anaheimCounty = new County(area.country, area.state, area.population, state.capitol, state.time,
                city.metropolia, city.mayor, "Anaheim", "92801");

        System.out.println("Population of " + anaheimCounty.state + " is " + city.population);


    }
}
