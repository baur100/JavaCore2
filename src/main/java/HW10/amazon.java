package HW10;

public class amazon {
    private String founder;
    private double value;
    private String[] subDivision;

    public amazon(String founder, double value, String[] subDivision) {
        this.founder = founder;
        this.value = value;
        this.subDivision = subDivision;
    }
    public amazon(){}

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

    public void setSubDivision(String[] subDivision) {
        this.subDivision = subDivision;
    }

    public String[] getSubDivision() {
        return subDivision;
    }

    public void printClass(){
        System.out.print("Array elements ");
        for (String v:subDivision) {
            System.out.print(" " + v);
        }
        System.out.println();
        System.out.println("Amazon " + founder + " " + value+" bln");
        System.out.println();
    }
}
