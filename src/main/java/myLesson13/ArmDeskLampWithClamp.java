package myLesson13;

public class ArmDeskLampWithClamp extends DeskLight {
    private int numberOfArms;

    public ArmDeskLampWithClamp(int price, String brand, String model, int numberOfArms) {
        super(price, brand, model);
        this.numberOfArms = numberOfArms;
    }


    public int getNumberOfArms() {
        return numberOfArms;
    }

    @Override
    public void standartEBulb() {
        System.out.println("I use E14 bulb");
    }
}
