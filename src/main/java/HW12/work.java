package HW12;

public class work {
    public static void main(String[] args) {
//_____________#1
        rearMotor marsExp = new rearMotor("rearLeft", 2.3, true);
        frontMotor marsExpArm = new frontMotor("arm1", 1.5);
        marsRoverMovement rollBack = new marsRoverMovement("motor1", 1.7, false, 3);

        marsExp.power();
        marsExp.moveForward();
        marsExpArm.turnArmRate();
        System.out.println("power setup for distance " + rollBack.getDistance() + " is " + rollBack.getDistancePower());
//_______________#2
        System.out.println("__________________________________");
        motor motor1 = new  motor("Motor1", 12.5);
        motorControl motorControl = new motorControl(motor1);
        controls sideStick = new controls(motorControl);
        System.out.println("voltage is " + sideStick.getForward().getMotor1().getVoltage());



    }
}
