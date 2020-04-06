package homework13;

public class Singer implements Artist{
    private int pay;

    public Singer(int pay){
        this.pay=pay;
    }
    public Singer() {
    }
    public void create() {
        System.out.println("I create.");
    }
    public void perform() {
        System.out.println("I perform.");
    }
    public int getPaid() {
        return pay;
    }
    public String toString() {
        return "Singer{" +
                "pay=" + pay +
                '}';
    }
}

