package hw14;

public class Wolf extends Carnivores {
    public String name;
    public String color;

    public Wolf(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void hasHair() {
        System.out.println(name+" has hair");

    }

    @Override
    public void hasSkull() {
        System.out.println(name+ " has a skull");

    }

    @Override
    public void canBreathe() {
        System.out.println(name+ "can breathe");

    }

    @Override
    public void canDie() {
        System.out.println(name+" can die");

    }

    @Override
    public void canBreed() {
        System.out.println(name+ "can breed");

    }

    @Override
    public void canEat() {
        System.out.println(name+" can eat");

    }
    public void canHowl(){
        System.out.println(name+ " can howl loudly");
    }
}



