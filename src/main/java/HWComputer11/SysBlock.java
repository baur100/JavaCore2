package HWComputer11;

public class SysBlock {
    private Motherboard motherboard;
    private String base;
    private Processor processor;
    private String videoCard;
    private int hdd;

    public SysBlock(){}

    public SysBlock(Motherboard motherboard, String base, Processor processor, String videoCard, int hdd) {
        this.motherboard = motherboard;
        this.base = base;
        this.processor = processor;
        this.videoCard = videoCard;
        this.hdd = hdd;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public String getBase() {
        return base;
    }
    public Processor getProcessor() {
        return processor;
    }
    public String getVideoCard() {
        return videoCard;
    }
    public int getHdd() {
        return hdd;
    }
    public void printSysB() {
        System.out.println("HDD size GB :"+hdd+"\nMade Of: "+base+"\nGraph: "+videoCard);
        processor.printProcc();
        motherboard.printMother();
    }
}
