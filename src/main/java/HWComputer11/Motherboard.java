package HWComputer11;

public class Motherboard {
    private String name;
    private String ramSlots;

    public Motherboard(){}

    public Motherboard(String name, String ramSlots) {
        this.name = name;
        this.ramSlots = ramSlots;
    }
    public String getName() {
        return name;
    }
    public String getRamSlots() {
        return ramSlots;
    }
    public void printMother(){
        System.out.println("Brand: "+name+"\nRAM "+ramSlots);
    }
}
