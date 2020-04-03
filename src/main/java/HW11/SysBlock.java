package HW11;

public class SysBlock {
    private Motherboard mb;
    private Processor cpu;

    public SysBlock( Motherboard mb, Processor cpu) {
        this.mb = mb;
        this.cpu = cpu;
    }

    public void printInfo() {
        String xx = "Motherboard{brand=" + mb + ", processor=" + cpu + '}';
        System.out.println(xx);
    }
}
