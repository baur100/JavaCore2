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

    public String getType() {
        return type;
    }

    public double getSpeed() {
        return speed;
    }

    public String getStorage() {
        return storage;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "type='" + type + '\'' +
                ", speed=" + speed +
                ", storage='" + storage + '\'' +
                '}';
    }
    //    public void printInfo() {
//       String xx = "Processor{"Processor = " + type+ "speed - " + speed + "storage -  "+storage '}'
//    }
}
