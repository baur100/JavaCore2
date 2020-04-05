package homework13;

public class IntDoors extends Doors implements Knob {
    private String model;
    private String color;


    public IntDoors(String model, String color) {
        this.model = model;
        this.color = color;
    }


    public IntDoors(String tipe, int size, String material, String model, String color) {
        super(tipe, size, material);
        this.model = model;
        this.color = color;
    }

    public void scream() {
        System.out.println(tipe + " дверь, " + size + " размера, не скрипит");
    }


    @Override
    public void lock() {
        System.out.println("Замок " + tipe + " двери из " + material + " закрыт");

    }

    @Override
    public void open() {
        System.out.println("Замок " + tipe + " двери из " + material + " открыт");
    }
}
