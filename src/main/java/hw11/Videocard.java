package hw11;

public class Videocard {
    private Name name;
    private int speed;
    private int memory;
    private String pci;

    public Videocard(Name name, int speed, int memory, String pci) {
        this.name = name;
        this.speed = speed;
        this.memory = memory;
        this.pci = pci;
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

    public void setPci(String pci) {
        this.pci = pci;
    }

    public String getPci() {
        return pci;
    }

    public void printInfo() {
        System.out.println("Video Card :\n{" + "Brand = " + name.getBrand() + "\n"
                + " Model = " + name.getModel() + "\n"
                + " Memory = " + memory  +  " GB" + "\n"
                + " Clock Speed = " + speed + " MHz" + "\n"
                + " PCI-e = " + pci + '}');
        System.out.println(App.line);
    }
}
