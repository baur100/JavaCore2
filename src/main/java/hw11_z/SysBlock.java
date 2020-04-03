package hw11_z;

public class SysBlock {
    private String name;
    private Processor processor;
    private Motherboard motherboard;




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


