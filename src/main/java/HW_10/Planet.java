package HW_10;

public class Planet {

    private String name;
    private String shape;
    private int population;



    public Planet(String name) {
        this.name = name;
    }

    public Planet( String sh, int population){
        shape = sh;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }


    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void printClass(){
        System.out.println("My new planet is called; " + name  + "." + " It has " + population + " population" + " and of course it is " + shape + ".");
    }
}
