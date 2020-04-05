package hWA13;

public class Jaguar extends Carnivorous {
    private String name;
    private String habitate;

    public Jaguar(int maxAge, String typeFood, String name, String habitat) {
        super(maxAge, typeFood, name, habitat);
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
        System.out.println("I can run very fast");
    }
    public String toString(){
       return "Name of animal: "+name+"\ncan live maximum "+maxAge+" years,"+"\nTipical habitat "+habitate+"\nthis animal favorites food is "+typeFood;
    }
}
