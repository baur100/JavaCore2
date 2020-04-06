package hw13;

public class Amd extends Cpu {

    @Override
    public void cpuSocket() {
        System.out.println("AM4 - Best Socket Ever");
    }

    @Override
    public void cpuBrand() {
        System.out.println("This is AMD!");
    }
}
