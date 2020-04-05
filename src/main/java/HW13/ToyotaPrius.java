package HW13;

//implements, abstract method - this body
public class ToyotaPrius implements Car {
    @Override
    public void speed() {
        System.out.println("Toyota Prius has less speed!");
    }

    @Override
    public void color() {
        System.out.println("Toyota Prius  has worse color!");
    }

    @Override
    public int getYear() {
        return 0;
    }
}




