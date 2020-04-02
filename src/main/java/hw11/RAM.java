package hw11;

public class RAM {
    private Name name;
    private int speed;
    private int memory;

    public RAM(Name name, int speed, int memory) {
        this.name = name;
        this.speed = speed;
        this.memory = memory;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }

    public void printInfo() {
        System.out.println("RAM :\n{" + "Brand = " + name.getBrand() + "\n"
                + " Model = " + name.getModel() + "\n"
                + " Memory = " + memory  +  " GB" + "\n"
                + " Clock Speed = " + speed + " MHz" + '}');
        System.out.println(App.line);
    }
}
