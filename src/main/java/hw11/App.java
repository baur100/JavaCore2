package hw11;

public class App {
    public static void main(String[] args) {
        CPU intel6700 = new CPU("Intel", "i7-6700", 3.40, 4, 8, 269.99);
        CPU intel7700K = new CPU("Intel", "i7-7700K", 4.20, 4, 8, 314.99);
        CPU amdRyzen5 = new CPU("AMD", "3600", 3.60, 6, 12, 174.99);
        CPU amdRyzen7 = new CPU("AMD", "3700X", 3.60, 8, 16, 298.99);

        Motherboard asrockH110 = new Motherboard("ASRock", "H110M-HDS", "H110", 54.99);
        Motherboard asusPrime = new Motherboard("ASUS", "PRIME B360M-A", "B360", 76.99);
        Motherboard asusAMD = new Motherboard("ASUS", "ROG Strix", "B450-F", 129.99);
        Motherboard msiMPG = new Motherboard("MSI", "MPG Gaming Plus", "X570", 159.95);

        GPU gpuHL = new GPU("EVGA", "GeForce 2070", 8, 589.99);
        GPU gpuLL = new GPU("XFX", "Radeon RX580", 8, 169.99);

        Disk ssd = new Disk("Samsung", "860 EVO SSD", 500, 84.99);
        Disk hdd = new Disk("Seagate", "FireCuda Hybrid Drive", 2000, 76.95);

        Keyboard keyboardWired = new Keyboard("Amazon", "Basics", 13.99);
        Keyboard keyboardWireless = new Keyboard("Logitech", "MK345", 32.62);

        Mouse mouseWired = new Mouse("Amazon", "Basics", 7.65);
        Mouse mouseWireless = new Mouse("Logitech", "M510", 21.97);

        RAM ram8GB = new RAM("Corsair", "Vengeance LPX", 8, 38.99);
        RAM ram16GB = new RAM("HyperX", "Fury", 16, 69.99);

        Monitor monitor23 = new Monitor("ViewSonic", "VA2359", 23, 123.77);
        Monitor monitor27 = new Monitor("HP", "27er", 27, 269.00);

        CustomBuild customBuild1 = new CustomBuild(intel6700, asrockH110, gpuLL,
                hdd, ram8GB, monitor23, keyboardWired, mouseWired);
        CustomBuild customBuild2 = new CustomBuild(intel7700K, asusPrime, gpuHL, ssd, ram16GB, monitor27,
                keyboardWireless, mouseWireless);
        CustomBuild customBuild3 = new CustomBuild(amdRyzen5, asusAMD, gpuLL, hdd, ram8GB,
                monitor23, keyboardWired, mouseWired);
        CustomBuild customBuild4 = new CustomBuild(amdRyzen7, msiMPG, gpuHL, ssd, ram16GB,
                monitor27, keyboardWireless, mouseWireless);
        customBuild1.printInfo();
        customBuild2.printInfo();
        customBuild3.printInfo();
        customBuild4.printInfo();

        System.out.println(customBuild1.getMotherboard().getChipset());
        System.out.println(customBuild1.getKeyboard().getPrice());
        System.out.println(customBuild2.getCpu().getBrand());


    }
}
