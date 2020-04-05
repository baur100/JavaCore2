package hWA13;

public class Cow extends Herbivorous {
    private String name;
    private String habitate;

    public Cow(int maxAge, String typeFood, String name, String habitate) {
        super(maxAge, typeFood);
        this.name = name;
        this.habitate = habitate;
    }

    public String getName() {
        return name;
    }

    public String getHabitate() {
        return habitate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHabitate(String habitate) {
        this.habitate = habitate;
    }

    @Override
    public void move() {
        System.out.println("I can walk slowly");
    }
    public void song(){
        System.out.println("my-myyyyy");
    }

    public String toString(){
        return "Name of animal: "+name+"\ncan live maximum "+ maxAge +" years,"+"\nTipical habitat "+habitate+"\nthis animal favorites food  is"+typeFood;
    }
}

