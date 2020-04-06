package hw12_z;

public class Construction {
    protected String type;
    protected int yearOfBuild;
    protected String style;
    protected Architect architect;

    public Construction(String type, int yearOfBuild, String style, Architect architect) {
        this.type = type;
        this.yearOfBuild = yearOfBuild;
        this.style = style;
        this.architect = architect;
    }

    public String getType() {
        return type;
    }

    public int getYearOfBuild() {
        return yearOfBuild;
    }

    public String getStyle() {
        return style;
    }

    public Architect getArchitect() {
        return architect;
    }
    public void constracting(){
        System.out.println(type+" is under construction");
    }
}
