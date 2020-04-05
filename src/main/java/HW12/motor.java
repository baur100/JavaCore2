package HW12;

public class motor {

    protected String name;
    protected double voltage;


    public motor(String name, double voltage) {
        this.name = name;
        this.voltage = voltage;
    }

    public String getName() {
        return name;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public double power() {
        double power = voltage * 12.4;
        System.out.println("Power set to " + power);
        return power;
    }

}
