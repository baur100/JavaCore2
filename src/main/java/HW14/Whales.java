package HW14;

public abstract class Whales implements Mammals {
    protected String Area;

    public Whales(String area) {
        Area = area;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public abstract void swim();
}
