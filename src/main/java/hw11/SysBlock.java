package hw11;

public class SysBlock {
    private Processor processor;
    private Motherboard motherboard;

    public SysBlock(Processor processor, Motherboard motherboard) {
        this.processor = processor;
        this.motherboard = motherboard;

    }

    public SysBlock(String htp, String agg) {

    }

    public SysBlock() {

    }


    public void printInfo() {
        System.out.println("SysBlock = " + processor + " + " + motherboard);
    }
}
