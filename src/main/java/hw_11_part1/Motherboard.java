package hw_11_part1;

public class Motherboard {

    private String memory;
    private String processor;

    public Motherboard( String memory, String processor) {
        this.memory = memory;
        this.processor = processor;
    }
    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void printInfo(){
        System.out.println("Motherboard detail;"+memory+" "+processor);
    }
}
