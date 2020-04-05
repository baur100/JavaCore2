package HW12;

public class Table {
    protected String shape;
    protected String color;
    protected int size;

    public Table() {}

    public Table(String shape, String color, int size) {
        this.shape = shape;
        this.color = color;
        this.size = size;
    }

    public void TableprintInfo () {
        String aa = ("Table shape: " + getShape() + ". Table color: " + getColor() + ". Table size: " + getSize());
        System.out.println(aa);
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


}
