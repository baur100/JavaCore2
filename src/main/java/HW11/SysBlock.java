package HW11;

public class SysBlock {
    private Motherboard mb;
    private Processor cpu;
    private PowerSupply ps;

    public SysBlock(Motherboard mb, Processor cpu, PowerSupply ps) {
        this.mb = mb;
        this.cpu = cpu;
        this.ps = this.ps;
    }

    public void printInfo() {
        String xx = "SysBlock{brand=" + mb + ", processor=" + cpu + ", powersupply=" + ps + '}';
        System.out.println(xx);
    }
}
