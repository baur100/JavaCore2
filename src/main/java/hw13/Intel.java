package hw13;

public class Intel extends Cpu {
    private Cpu cpu;

    @Override
    public void cpuBrand() {
        System.out.println("This is Intel");
    }

    @Override
    public void cpuSocket() {
        System.out.println("It has Intel socket");
    }
}
