package HW12;

public class PatioChair extends PatioTable {
    protected String style;

    public PatioChair(String shape, String color, int size, String glasscolor, String style) {
        super(shape, color, size, glasscolor);

        this.style = style;
    }
    public void PatioChairprintInfo () {
        String dd = ("Patio chair shape: " + getShape() + ".  Patio chair color: " + getColor() +  ". Patio chair size:" +
                   + getSize() +  ". Patio chair glasscolor: " + getGlasscolor() +  ". Patio chair style: " + getStyle());
        System.out.println(dd);
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
