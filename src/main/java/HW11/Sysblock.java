package HW11;

public class Sysblock {
    private Processor processor;
    private MotherBlock motherBlock;
    private RAM ram;

    public Sysblock(Processor processor, MotherBlock motherBlock, RAM ram) {
        this.processor = processor;
        this.motherBlock = motherBlock;
        this.ram = ram;
    }

    public Sysblock() {
    }

    public void printInfo () {
        processor.printInfo();
        motherBlock.printInfo();
        ram.printInfo();
    }
}
