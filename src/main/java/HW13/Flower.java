package HW13;

public class Flower extends NonEdible{
    public Flower(String name, String category) {
        super(name, category);
    }

    public void bloom(){
        System.out.println("This "+name+" blooms.");
    }
}
