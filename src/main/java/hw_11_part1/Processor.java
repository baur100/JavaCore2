package hw_11_part1;

public class Processor {
    private String processor;
    private String powerUnit;
    private String hardDrive;


    public Processor(){}

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getPowerUnit() {
        return powerUnit;
    }

    public void setPowerUnit(String powerUnit) {
        this.powerUnit = powerUnit;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public Processor(String processor, String powerUnit, String hardDrive) {
        this.processor = processor;
        this.powerUnit = powerUnit;
        this.hardDrive = hardDrive;

    }
    public void printInfo(){
        System.out.println("Processor detail: "+powerUnit + "," + hardDrive  + "," + processor);

    }
}
