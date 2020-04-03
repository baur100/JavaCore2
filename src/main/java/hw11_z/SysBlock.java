package hw11_z;

public class SysBlock {
    private Processor processor;
    private Motherboard motherboard;

    public SysBlock(Processor processor) {
        this.processor = processor;
    }

    public SysBlock(Motherboard motherboard) {
        this.motherboard = motherboard;

    }


    public Motherboard getMotherboard() {
        return motherboard;
    }

    public Processor getProcessor() {
        return processor;
    }


    public void printInfo() {
        String sysBlock = "SysBlock{" +
                "processor=" + processor +
                ", motherboard=" + motherboard +
                '}';
        System.out.println(sysBlock);
    }
}


