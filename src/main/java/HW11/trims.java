package HW11;

public class trims {
    private String name;
    private String type;
    private int costindex;

    public trims(String name, String type, int costindex) {
        this.name = name;
        this.type = type;
        this.costindex = costindex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setCostindex(int costindex) {
        this.costindex = costindex;
    }

    public int getCostindex() {
        return costindex;
    }

    public void printInfo(){
        System.out.println("Trim = "+ type);
    }
}
