package HW12;

public final class frontMotor extends motor {

    private double turnRate;

    public frontMotor(String name, double voltage) {
        super(name, voltage);
        this.turnRate = turnRate;
    }

    public void setTurnRate(int turnRate) {
        this.turnRate = turnRate;
    }

    @Override
    public void setVoltage(double voltage) {
        super.setVoltage(voltage);
    }

    public double turnArmRate(){
        turnRate = power()/19.7;
        System.out.println("Turn rate is " + Math.round(turnRate)   + "° per sec");
        return turnRate;
    }
}
