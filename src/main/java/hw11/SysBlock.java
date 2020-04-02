package hw11;

public class SysBlock {
    private String motherBoard;
    private String processor;
    private int memoryGB;

    public SysBlock(String motherBoard, String processor, int memoryGB) {
        this.motherBoard = motherBoard;
        this.processor = processor;
        this.memoryGB = memoryGB;
    }

    public void printInfo() {
        String yy = "Sysblock {Motherboard brand = " + motherBoard + ", Processor = " + processor + ", Memory size in GB: "
                + memoryGB + '}';
        System.out.println(yy);
    }
}
