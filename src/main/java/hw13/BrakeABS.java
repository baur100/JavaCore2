package hw13;

public class BrakeABS implements BrakesType {
    @Override
    public void brake() {
        System.out.println();
        System.out.println("ABS was Used");
    }
}
