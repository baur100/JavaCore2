package hw12_z;

public class Mall extends Construction {
    private int capacity;
    private int sq;

    public Mall(String type, int yearOfBuild, String style, Architect architect, int capacity, int sq) {
        super(type, yearOfBuild, style, architect);
        this.capacity = capacity;
        this.sq = sq;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSq() {
        return sq;
    }
}
