package hw12_z;

public class Building extends Construction{
    private int floors;


    public Building(String type, int yearOfBuild, String style, Architect architect, int floors) {
        super(type, yearOfBuild, style, architect);
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

}
