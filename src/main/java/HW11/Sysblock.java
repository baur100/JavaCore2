package HW11;

public class Sysblock {
    private String processor;
    private String motherBlock;
    private int ram;

    public Sysblock(String processor, String motherBlock, int ram) {
        this.processor = processor;
        this.motherBlock = motherBlock;
        this.ram = ram;
    }
    public Sysblock (){};
    public void SysblockprintInfo () {
        System.out.println("Sysblock : \n Processor: " + getProcessor() + "\nMotherBlock: " + getMotherBlock() + "\n RAM: " + getRam());
    }

    public String getProcessor() {
        return processor;
    }

    public String getMotherBlock() {
        return motherBlock;
    }

    public int getRam() {
        return ram;
    }

    public void setMotherBlock(String motherBlock) {
        this.motherBlock = motherBlock;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
