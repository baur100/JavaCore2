package HW12;

public class Babychair extends PatioChair {

    private int hight;

    public void BabychairprintInfo (){
        String ee = ("Baby chair shape: "  + getShape()+ ". Baby chair color: "  + getColor() + ". Baby chair size: "
                    + getSize() +  ". Baby chair style: "  + getStyle()+ ". Baby chair hight: " + getHight());
        System.out.println(ee);
    }

    public Babychair(String shape, String color, int size, String glasscolor, String style, int hight) {
        super(shape, color, size, glasscolor, style);
        this.hight = hight;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int higth) {
        this.hight = higth;
    }


}
