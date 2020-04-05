package HW12;

public class rearMotor extends motor{
     protected   double power;
     protected boolean direction;

    public rearMotor(String name, double voltage, boolean direction) {
        super(name, voltage);
        //this.power = power;
        this.direction = direction;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public double getVoltage() {
        return voltage;
    }
    public void moveForward(){
        if (direction) {
            System.out.println("Moving forward with " + power());
            return;
        }
    }
    public void moveBackward() {
        if (!direction) {
            System.out.println("Moving backward with " + power());
            return;
        }
    }
}
