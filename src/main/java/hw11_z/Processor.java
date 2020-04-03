package hw11_z;

public class Processor {
    private String name;
    private String cpu;

    public Processor(String name, String cpu) {
        this.name = name;
        this.cpu = cpu;
    }
    public void printInfo(){
        String processor= "Processor = " + name + ", CPU = " + cpu+'}';
        System.out.println(processor);
    }

    public String getName() {
        return name;
    }

    public String getCpu() {
        return cpu;
    }
}
