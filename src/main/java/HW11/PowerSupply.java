package HW11;

public class PowerSupply {
    private String power;
    private String current;
    private String volt;

    public PowerSupply(String power, String current, String volt) {
        this.power = power;
        this.current = current;
        this.volt = volt;
    }

    public void printInfo() {
        String xx = "PowerSupply{power=" + power + ", current=" + current + ", volt=" + volt + '}';
        System.out.println(xx);
    }

}
