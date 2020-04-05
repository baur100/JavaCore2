package hw13;

public class SUV extends Vehicle{
    private String application;

    public SUV(BrakesType brakes, double price, String make, String model, int seats, String application) {
        super(brakes, price, make, model, seats);
        this.application = application;
    }

    public String getApplication() {
        return application;
    }

    @Override
    public void fuel() {
        System.out.println("\nE91 Unleaded Gas is Used");
    }
}
