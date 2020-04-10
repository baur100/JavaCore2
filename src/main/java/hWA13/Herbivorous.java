package hWA13;

public class Herbivorous implements Animals {
    protected int maxAge;
    protected String typeFood;

    public Herbivorous(int maxAge, String typeFood) {
        this.maxAge = maxAge;
        this.typeFood = typeFood;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public String getTypeFood() {
        return typeFood;
    }


    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public void setTypeFood(String typeFood) {
        this.typeFood = typeFood;
    }



    @Override
    public void move() {
        System.out.println("i can run");
    }

    @Override
    public void breath() {
        System.out.println("i can breath");

    }

    @Override
    public void song() {
        System.out.println("i can make songs");

    }

    @Override
    public int maxAge() {
        return maxAge;
    }
}
