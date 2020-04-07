package hw11_Computer;

public class SystBlock {
    private String name;
    private Processor processor;
    private MotherBoard motherBoard;
    private int memory;
    private String color;

    public SystBlock(String name, Processor processor, MotherBoard motherBoard, int memory, String color) {
        this.name = name;
        this.processor = processor;
        this.motherBoard = motherBoard;
        this.memory = memory;
        this.color = color;
    }

    public void printSBinfo(){
        System.out.println("System block: " +name+" "+processor.getModel()+", "+motherBoard.getModel()+", "+"RAM - "+memory+"Gb, "+color);


    }
}
