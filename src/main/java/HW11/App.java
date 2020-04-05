package HW11;

public class App {
    public static void main(String[] args) {


        Computer computer = new Computer("Dell", "Dell", 88 );
        computer.ComputerprintInfo();

        Monitor monitor = new Monitor("Dell", "SP", 13);
        monitor.MonitorprintInfo();

        Sysblock sysblock = new Sysblock ("Parsel", "ABC", 16);
        sysblock.SysblockprintInfo();

        MotherBlock motherBlock = new MotherBlock("Intel", "i7");
        motherBlock.MotherBlockprintInfo();

        RAM ram = new RAM(8);
        ram.RAMprintInfo();

        Processor processor = new Processor("Intel", 16);
        processor.ProcessorprintInfo();

        Mouse mouse =new Mouse("DELL", "Black");
        mouse.mouseprintInfo();

    }
}
