package hw13;

public class App {
    public static void main(String[] args) {
        Socket intel = new Intel();
        intel.cpuBrand();
        intel.cpuSocket();

        System.out.println();

        Socket amd = new Amd();
        amd.cpuBrand();
        amd.cpuSocket();

    }
}
