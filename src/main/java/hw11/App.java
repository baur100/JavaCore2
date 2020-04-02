package hw11;

public class App implements Line {

    public static void main(String[] args) {

        // FIRST PART OF THE HOMEWORK / SECOND PART IS AT THE END
        // INITIALIZING NAME OBJECTS FOR COMPUTER COMPONENTS

        Name pcN = new Name("DELL", "XPS");
        Name pcN2 = new Name("HP", "HP-2707");
        Name cpuN = new Name("INTEL", "i9-9900");
        Name cpuN2 = new Name("AMD", "Threadripper");
        Name kbN = new Name("LOGITECH", "K-350");
        Name msN = new Name("RAZER", "DeathAdder");
        Name mnN = new Name("ACER", "V206HQ");
        Name mbN = new Name("ASUS", "ROG");
        Name mbN2 = new Name("ASUS", "Zephyr");
        Name ethN = new Name("QUALCOMM", "AR928X");
        Name ramN = new Name("DELL", "370-ABKB");
        Name ramN2 = new Name("CORSAIR", "VENGEANCE");
        Name audN = new Name("CREATIVE AUDIO", "SOUNDBLASTER");
        Name vidN = new Name("ATI", "RADEON");
        Name vidN2 = new Name("NVIDIA", "GEFORCE");

        // COMPUTER COMPONENT OBJECTS

        Motherboard mb = new Motherboard(mbN, 6, 7, 7);
        Motherboard mb2 = new Motherboard(mbN2, 7, 8, 4);
        CPU cpu = new CPU(cpuN, "2.4");
        CPU cpu1 = new CPU(cpuN2, "3.0");
        NetworkAdapter eth = new NetworkAdapter(ethN, "ax", "300");
        RAM ram = new RAM(ramN, 2666, 16);
        RAM ram2 = new RAM(ramN2, 2800, 32);
        Soundcard aud = new Soundcard(audN);
        Videocard vid = new Videocard(vidN, 2666, 8, "PCI-e 3.0");
        Videocard vid2 = new Videocard(vidN2, 3666, 12, "PCI-e 3.0");
        Keyboard kb = new Keyboard(kbN);
        Mouse ms = new Mouse(msN);
        Monitor mn = new Monitor(mnN, "60");
        Sysblock sb = new Sysblock(cpu, mb, ram, eth, aud, vid);
        Sysblock sb2 = new Sysblock(cpu1, mb2, ram2, eth, aud, vid2);

        // TWO COMPUTER INSTANCES ARE CREATED (DELL, HP)

        Computer dell = new Computer(pcN, sb, mn, kb, ms);
        Computer hp = new Computer(pcN2, sb2, mn, kb, ms);

        // DELL PRINT INFO METHOD

        dell.printInfo();

        System.out.println(div);
        System.out.println(line);

        // HP PRINT INFO METHOD

        hp.printInfo();

        System.out.println(div);
        System.out.println(line);

        // ACCESSING VARIOUS COMPONENTS

        dell.getSysblock().getVideo().printInfo();
        dell.getKeyboard().printInfo();
        dell.getSysblock().getMb().printInfo();
        dell.getSysblock().getAudio().getName().printInfo();
        System.out.println(hp.getSysblock().getRam().getMemory());
        System.out.println(line);
        System.out.println(div);
        System.out.println(line);

        // SECOND PART OF THE HOMEWORK

        Address address = new Address("145 Kester Ave Apt 5", "Van Nuys", "CA", 91606);
        Profile profile = new Profile("John Doe", "Clerk", "Reception", 20.0, 1.5, 432);

        Employee emp1 = new Employee(address, profile);
        emp1.getProfile().displayProfile();
        emp1.getAddress().displayAddress();
    }
}
