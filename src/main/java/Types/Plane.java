package Types;

public class Plane {
    public String name;

    @Override
    public String toString() {
        return "name=" + name;
    }

    public String getInfo() {
        return name;
    }
}
