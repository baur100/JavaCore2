package HW10;

public class Countries {

    private String name;
    private String continent;
    private int population;

    public Countries(String name) {
        this.name = name;
    }

    public Countries(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public Countries(String name, String continent, int population) {
        this.name = name;
        this.continent = continent;
        this.population = population;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printClass(){
        System.out.println("The name of country is " +name+" from the continent of "+continent+" and its population is "+population+ " mln");
    }

}
