package homework.hw11;

import l14.Brand;

public class Sysblock {
    private Brands brand;
    private Processor processor;
    private Matherboard matherboard;

    public Sysblock(Brands brand, Processor processor, Matherboard matherboard) {
        this.brand = brand;
        this.processor = processor;
        this.matherboard = matherboard;
    }

    public void printInfo() {
        System.out.println("---System block info---");
        System.out.println("System block brand is " + this.brand.toString());
        this.processor.printInfo();
        this.matherboard.printInfo();
    }
}
