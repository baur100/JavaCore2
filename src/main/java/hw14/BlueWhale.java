package hw14;

public class BlueWhale extends Carnivores {
    public String name;
    public int size;

    public BlueWhale(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
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
    public void canDive(){
        System.out.println(name+" can dive so deep");

    }
}
