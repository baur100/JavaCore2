package hWA14;

public abstract class Whales implements Mammals {
    protected Area habitat;

    public Whales(Area habitat) {
        this.habitat = habitat;
    }

    public Area getHabitat() {
        return habitat;
    }

    public abstract void canSwim();

}
