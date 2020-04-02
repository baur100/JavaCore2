package hWA11;

public class Work {
    public static void main(String[]args){

        Mouse mouse=new Mouse("Apple");
        Monitor monitor =new Monitor("Apple","27'iMac",27);
        KeyBoard keyBoard = new KeyBoard("Apple");

        Prosessor prosessor = new Prosessor("Intel", "I9");
        MotherBoard motherBoard = new MotherBoard("Azuz","z-390");
        Gpu gpu = new Gpu("MSI", "RX580");
        Memory memory=new Memory("Corser", 32);
        Cpu_cooler cpuCooler = new Cpu_cooler("Air","Corsar");
        Hdd hdd=new Hdd("Intel", 600);
        PowerSupply powerSupply = new PowerSupply("Corsar", 700);

        SysBlock sysBlock=new SysBlock(prosessor,motherBoard,gpu, memory, cpuCooler, hdd, powerSupply);
        Computer myComputer = new Computer(monitor, sysBlock, mouse, keyBoard);


        myComputer.printInfo();
        System.out.println("Memory capacity of my computer is : "+myComputer.getSysBlock().getMemory().getCapacity());

        System.out.println("______________________");

        Insurance insurance=new Insurance("STM","May/7/2020",6,125,"NatGen PPO 100000");
        Address address = new Address("138 Paelhe Str.","Huston","Baton Ruge",78701);
        Name name = new Name("Lana","Coelha");

        Contact contact = new Contact(name,address, insurance);
        contact.printInfo();
    }
}
