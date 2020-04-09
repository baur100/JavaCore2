package HWComputer11;

public class Processor {
    private String type;
    private int memory;
    private double processorSpeed;

    public Processor() {
    }
    public String getType() {
        return type;
    }
    public int getMemory() {
        return memory;
    }
    public double getProcessorSpeed() {
        return processorSpeed;
    }
    public Processor(String type, int memory, double processorSpeed) {
        this.type = type;
        this.memory = memory;
        this.processorSpeed = processorSpeed;

    }
    public void printProcc(){
        System.out.println("Type:"+type+"\nMemory: "+memory+"\nProcessor speed: "+processorSpeed);
    }
}
