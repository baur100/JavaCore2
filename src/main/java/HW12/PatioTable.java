package HW12;

public class PatioTable extends Table {

    protected String glasscolor;

    public PatioTable(String shape, String color, int size, String glasscolor) {
    super(shape, color, size);

    this.glasscolor = glasscolor;
    }

    public void PatioTableprintInfo () {
        String bb = ("Patio table shape: " + getShape() + ". Patio table color: " + getColor() + ". Patio table size: "
                      + getSize() + ". Patio Table glass color: " + getGlasscolor());
        System.out.println(bb);
    }

    public String getGlasscolor() {
        return glasscolor;
    }

    public void setGlasscolor(String glasscolor) {
        this.glasscolor = glasscolor;
    }
}
