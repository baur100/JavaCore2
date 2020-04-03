package hw11;

public class Processor {
    private String type;
    private double speed;
    private String storage;

    public Processor(String type, double speed, String storage) {
        this.type = type;
        this.speed = speed;
        this.storage = storage;

    }
    public Processor(){

    }
    public void printInfo() {
        System.out.println("Processor = " + type+ "speed - " + speed + "storage -  "+storage );
    }
}
