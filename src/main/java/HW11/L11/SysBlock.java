package HW11.L11;

public class SysBlock {
    private Processor processor;
    private Motherboard motherboard;

    public SysBlock(Processor processor, Motherboard motherboard) {
        this.processor = processor;
        this.motherboard = motherboard;
    }

    public void printInfo(){
       processor.printInfo();
       motherboard.printInfo();
    }
}
