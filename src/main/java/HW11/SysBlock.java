package HW11;

public class SysBlock {
    private MotherBoard MB;
    private Processor processor;
    private HDD hdd;
    private RAM ram;
    private Graphic graphic;
    private trims trim;

    public SysBlock(MotherBoard MB, Processor processor, HDD hdd, RAM ram, Graphic graphic, trims trim) {
        this.MB = MB;
        this.processor = processor;
        this.hdd = hdd;
        this.ram = ram;
        this.graphic = graphic;
        this.trim = trim;
    }

    public SysBlock() {
    }

    public void setMB(MotherBoard MB) {
        this.MB = MB;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public void setGraphic(Graphic graphic) {
        this.graphic = graphic;
    }

    public void setTrim(trims trim) {
        this.trim = trim;
    }

    public MotherBoard getMB() {
        return MB;
    }

    public Processor getProcessor() {
        return processor;
    }

    public HDD getHdd() {
        return hdd;
    }

    public RAM getRam() {
        return ram;
    }

    public Graphic getGraphic() {
        return graphic;
    }

    public trims getTrim() {
        return trim;
    }

    public void printInfo(){
        System.out.println("System unit contains: " +
                "Motherboard " + MB.getBrand().getName()+ MB.getSocketName() + '\'' +
                ", processor '" + processor.getBrand().getName() + '\'' +
                ", ram " + ram.getBrand().getName() + ram.getRam() + " GB" + '\'' +
                ", hdd '" + hdd.getBrand().getName() + hdd.getType() + " " + hdd.getVol()+ " GB" + '\'' +
                ", graphic '" + graphic.getBrand().getName()+ graphic.getRam()+ " GB" + '\'' +
                ", trim '" + trim.getName() + '\'' +
                " ");
    }
}
