package hw12_task2;

public class MakeUp extends Cosmetic{
    protected String color;
    protected String action;


    public MakeUp(String brand, int size, int price, String color, String action) {
        super(brand, size, price);
        this.color = color;
        this.action = action;
    }

    public String getColor() {
        return color;
    }

    public String getAction() {
        return action;
    }
}
