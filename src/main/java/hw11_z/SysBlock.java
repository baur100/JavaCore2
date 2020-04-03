package hw11_z;

public class SysBlock {
    private String name;
    private Processor processor;
    private Motherboard motherboard;

    public SysBlock(String name, Processor processor, Motherboard motherboard) {
        this.name = name;
        this.processor = processor;
        this.motherboard = motherboard;
    }

    public Motherboard getMotherboard() { return motherboard;
    }

    public Processor getProcessor() { return processor;
    }

    public String getName() { return name;
    }

    public void printInfo(){
        String sa = name;
        System.out.println("Brand name = "+ sa);
        processor.printInfo();
        motherboard.printInfo();
    }
}


