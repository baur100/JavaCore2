package HW11.L11;

public class SysBlock {
    private String processor;
    private String motherboard;
    private int ram;

    public SysBlock(String processor, String motherboard, int ram) {
        this.processor = processor;
        this.motherboard = motherboard;
        this.ram = ram;
    }
    public void printInfo(){
        System.out.println("SysBlock: processor = "+processor+", motherboard = "+motherboard+", RAM = "+ram);
    }
}
