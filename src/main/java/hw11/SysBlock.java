package hw11;

public class SysBlock {
    private Motherboard motherBoard;
    private Processor processor;

    public SysBlock(Motherboard motherBoard, Processor processor) {
        this.motherBoard = motherBoard;
        this.processor = processor;
    }

    public void printInfo() {
        motherBoard.printInfo();
        processor.printInfo();
    }
}
