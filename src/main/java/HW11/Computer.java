package HW11;

public class Computer {
    private String monitor;
    private String sysblock;
    private int mouse;

    public Computer(String monitor, String sysblock, int mouse) {
        this.monitor = monitor;
        this.sysblock = sysblock;
        this.mouse = mouse;
    }
    public Computer () {};



    public void ComputerprintInfo(){String yy =("Computer: \nMonitor: " + getMonitor() + "\nSysblock: " + getSysblock() + "\nMouse: " + getMouse());
        System.out.println(yy);}



    public String getMonitor() {
        return monitor;
    }

    public String getSysblock() {
        return sysblock;
    }

    public int getMouse() {
        return mouse;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public void setSysblock(String sysblock) {
        this.sysblock = sysblock;
    }

    public void setMouse (int mouse) {
        this.mouse = mouse;
    }
}
