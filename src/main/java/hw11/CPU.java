package hw11;

public class CPU {
    private Name name;
    private String clockspeed;

    public CPU(Name name, String clockspeed) {
        this.name = name;
        this.clockspeed = clockspeed;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("CPU :\n{" + "Brand = " + name.getBrand() + "\n"
                            + " Model = " + name.getModel() + "\n"
                            + " ClockSpeed = " + clockspeed  +  " GHz" + '}');
        System.out.println(App.line);
    }
}
