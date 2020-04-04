package hw12;

public class TV3D extends TV {
    protected String convecter3D;
    protected String sound3D;

    public TV3D(String name, String model, int size, String convecter3D, String sound3D) {
        super(name, model, size);
        this.convecter3D = convecter3D;
        this.sound3D = sound3D;

    }

    public void prinCondition() {
        System.out.println("3DTV is working");
    }

    public String getConvecter3D() {
        return convecter3D;
    }

    public String getSound3D() {
        return sound3D;
    }
}