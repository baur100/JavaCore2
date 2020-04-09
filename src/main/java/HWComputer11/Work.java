package HWComputer11;

public class Work {
    public static void main(String[] args) {
        Monitor acer=new Monitor("HP","XS-2001",23);
        Monitor lg = new Monitor("LG","777",42);
        Keyboard dell=new Keyboard("LogiTech");
        Mouse samsung=new Mouse("Alton");
        Motherboard asus = new Motherboard("Asus","3");
        Processor amd = new Processor("AMD",512,4.2);
        Processor argo = new Processor("Intel",512,3.2);
        SysBlock hp=new SysBlock(asus,"Plastic/Glass",amd,"AGP",1000);
        Computer toshiba=new Computer(acer,hp,samsung,dell);
        Computer lenovo = new Computer(lg,hp,samsung,dell);
        lenovo.printInfo();
        toshiba.printInfo();





    }
}
