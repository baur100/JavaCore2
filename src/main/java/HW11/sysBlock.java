package HW11;

public class sysBlock {
    private motherBoard MB;
    private HW11.processor processor;
    private HDD hdd;
    private RAM ram;
    private HW11.graphic graphic;
    private trims trim;

    public sysBlock(motherBoard MB, HW11.processor processor, HDD hdd, RAM ram, HW11.graphic graphic, trims trim) {
        this.MB = MB;
        this.processor = processor;
        this.hdd = hdd;
        this.ram = ram;
        this.graphic = graphic;
        this.trim = trim;
    }

    public sysBlock() {
    }

    public void setMB(motherBoard MB) {
        this.MB = MB;
    }

    public void setProcessor(HW11.processor processor) {
        this.processor = processor;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public void setGraphic(HW11.graphic graphic) {
        this.graphic = graphic;
    }

    public void setTrim(trims trim) {
        this.trim = trim;
    }

    public motherBoard getMB() {
        return MB;
    }

    public HW11.processor getProcessor() {
        return processor;
    }

    public HDD getHdd() {
        return hdd;
    }

    public RAM getRam() {
        return ram;
    }

    public HW11.graphic getGraphic() {
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
