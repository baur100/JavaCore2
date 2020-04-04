package HW11;

public class Sysblock {
    private Processor processor;
    private Motherboard motherboard;
    private Color color;

    public Sysblock(Processor processor, Motherboard motherboard, Color color) {
        this.processor = processor;
        this.motherboard = motherboard;
        this.color = color;
    }

    public Processor getProcessor() {
        return processor;
    }
    public Motherboard getMotherboard() {
        return motherboard;
    }
    public Color getColor() {
        return color;
    }
    public void printInfo(){
        processor.printInfo();
        motherboard.printInfo();
        color.printInfo();
    }

    @Override
    public String toString() {
        return "Sysblock{" +
                "processor=" + processor +
                ", motherboard=" + motherboard +
                ", color=" + color +
                '}';
    }
}
