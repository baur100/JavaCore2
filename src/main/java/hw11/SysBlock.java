package hw11;

public class SysBlock {
    private Motherboard motherboard;
    private Harddrive harddrive;
    private Memory memory;
    private Processor processor;


    public SysBlock(Motherboard motherboard, Memory memory, Processor processor, Harddrive harddrive) {
        this.motherboard = motherboard;
        this.memory = memory;
        this.processor = processor;
        this.harddrive = harddrive;
    }


    public void printInfo(){
        motherboard.printInfo();
        memory.printInfo();
        processor.printInfo();
        harddrive.printInfo();

    }


}
