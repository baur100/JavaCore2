package hw11;

public class Motherboard {
    private String type;
    private int ram;
    private long serial;

    public Motherboard(String type, int ram, long serial) {
        this.type = type;
        this.ram = ram;
        this.serial = serial;
    }
    public Motherboard(){

    }

    public String getType() {
        return type;
    }

    public int getRam() {
        return ram;
    }

    public long getSerial() {
        return serial;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setSerial(long serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "type='" + type + '\'' +
                ", ram=" + ram +
                ", serial=" + serial +
                '}';
    }
//    public void printInfo() {
//        System.out.println("MotherBoard = " + type + "RAM - " + ram + "serial NO SSN " + serial);
    }

