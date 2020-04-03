package hw11;

public class Processor {
    private  String manufecture;
    private  String model;
    private int speed;
    private int wtt;
    private int modelYear;

    public Processor(String manufecture, String model, int speed, int wtt, int modelYear) {
        this.manufecture = manufecture;
        this.model = model;
        this.speed = speed;
        this.wtt = wtt;
        this.modelYear = modelYear;
    }
    public void printInfo(){
        System.out.println("Processor: (CPU) Manufacturer "+manufecture+" Processor (CPU) Model "+model+" Processor (CPU) Speed " +speed+"Ghz"+" Wattage "+wtt+"watts"+" Model Year"+modelYear);
    }
}
