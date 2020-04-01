package HW10;

public class spaceX {
    private String founder;
    private double value;
    private String[] vessel;

    public spaceX(String founder, double valued, String[] Vessel){
        this.founder = founder;
        value = valued;
        this.vessel = Vessel;
    }
    public spaceX(){}

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public String getFounder() {
        return founder;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setVessel(String[] vessel) {
        this.vessel = vessel;
    }

    public String[] getVessel() {
        return vessel;
    }

    public void printClass() {
        System.out.print("Array elements ");
        for (String v : vessel) {
            System.out.print(" " + v);
        }
        System.out.println();
        System.out.println("SpaceX" + founder + " " + value + " bln");
        System.out.println();
    }
}


