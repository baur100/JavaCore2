package hw_11_part1;

public class SysBlock {

    private Motherboard motherboard;
    private Processor processor;

    public SysBlock(Motherboard motherboard, Processor processor) {
        this.motherboard = motherboard;
        this.processor = processor;
    }

    public SysBlock() {

    }

    public void printInfo(){
        System.out.println();
    }
}
