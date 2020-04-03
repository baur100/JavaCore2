package hw11_z;

public class Motherboard {
    private String ram;
    private String processorSocket;

    public Motherboard(String ram, String processorSocket) {
        this.ram = ram;
        this.processorSocket = processorSocket;
    }
//    public void printInfo(){
//        String motherboard= "RAM = " + ram + ", Processor Socket = " + processorSocket+'}';
//        System.out.println(motherboard);
//    }

    public String getProcessorSocket() {
        return processorSocket;
    }

    public String getRam() {
        return ram;
    }
}
