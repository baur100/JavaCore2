package hw14;

public abstract class Primates implements Mammals {
    protected String grip;

    public String getGrip() {
        return grip;
    }

    public Primates(String grip) {
        this.grip = grip;

    }

    public void setGrip(String grip) {
        this.grip = grip;
    }
}