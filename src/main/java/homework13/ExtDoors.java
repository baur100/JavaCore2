package homework13;

public class ExtDoors extends IntDoors implements Hinges{



    public ExtDoors(String model, String color) {
        super(model, color);
    }

    public ExtDoors(String tipe, int size, String material, String model, String color) {
        super(tipe, size, material, model, color);
    }

    @Override
    public void lube() {
        System.out.println("Петли у "+tipe+" двери из"+material+" скрипят, нужно смазать");

    }
}
