package HW11;

public class Mac {
    private Display display;
    private Storage storage;
    private Inshurance inshurance;
    private ProcessorM processorM;
    private Memory memory;
    private Serialnumber serialnumber;
    private Size size;

    public Mac(Display display, Storage storage, Inshurance inshurance, ProcessorM processorM, Memory memory, Serialnumber serialnumber, Size size) {
        this.display = display;
        this.storage = storage;
        this.inshurance = inshurance;
        this.processorM = processorM;
        this.memory = memory;
        this.serialnumber = serialnumber;
        this.size = size;
    }

    public void printInfo(){
        size.printInfo();
        display.printInfo();
        storage.printInfo();
        inshurance.printInfo();
        processorM.printInfo();
        memory.printInfo();
        serialnumber.printInfo();
    }
}
