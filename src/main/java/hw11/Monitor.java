package hw11;

public class Monitor {
    private Name name;
    private String hz;

    public void setName(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public void setHz(String hz) {
        this.hz = hz;
    }

    public String getHz() {
        return hz;
    }

    public Monitor(Name name, String hz) {
        this.name = name;
        this.hz = hz;
    }

    public void printInfo() {
        System.out.println("Monitor :\n{" + "Brand = " + name.getBrand() + "\n"
                            + " Model = " + name.getModel() + "\n"
                            + " Refresh Rate = " + hz  +  " Hz" + '}');
        System.out.println(App.line);
    }
}
