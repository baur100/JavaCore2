package hw15;

import org.w3c.dom.ls.LSOutput;

public class Outfit {
    private Shirt shirt;
    private Pants pants;
    private Shoes shoes;

    public Outfit(Shirt shirt, Pants pants, Shoes shoes) {
        this.shirt = shirt;
        this.pants = pants;
        this.shoes = shoes;
    }

    public Shirt getShirt() {
        return shirt;
    }

    public Pants getPants() {
        return pants;
    }

    public Shoes getShoes() {
        return shoes;
    }
    public String printInfo(){
        return ("Outfit for today: " + shirt.getColor()+ " " +shirt.getType() + ", " + pants.getColor() + " " + pants.getType()
                + ", " + shoes.getColor() + " " +shoes.getType());
    }
    public void wear() {
        shirt.printInfo();
        pants.printInfo();
        shoes.printInfo();
    }
}
