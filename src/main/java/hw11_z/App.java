package hw11_z;

public class App {
    public static void main(String[] args) {
        Address address=new Address("WA","Kirkland","13902 NE 8th st",98005);
//        Seller curtis = new Seller("Curtis","Smith",address);
//        Realtor realtor = new Realtor("Kate","Wallis",4253478421L,address,65000);
//        Listening info = new Listening(curtis,realtor,address);
//        info.ListeningInfo();

        Children children = new Children("Alan",15,"Agatha",3.5);
        LastName lastname = new LastName("Donson");
        Mother anna = new Mother("Anna",lastname,children,address);
        Family info1 = new Family(lastname,children,anna,address);
        info1.familyInfo();




//        Listening property = new Listening("WA", "House", "Single Family", 98001, "For sale");
//        Realtor realtor = new Realtor("Kate", "Wallis", 4253456781L, "123A23", "Great Seattle", property);
////        realtor.getListening().printListening();
//        Address address = new Address(property, "Kirkland", "13902 NE 8th st");
//        Seller curtis = new Seller("Curtis", "Smith",address,property);
//        Info all = new Info
//                (curtis,realtor,property,address);
//        all.printInfo();


//        Mouse mouse = new Mouse("Logitech");
//////        mouse.printInfo();
////        Keyboard kb = new Keyboard("Microsoft");
//////        kb.printInfo();
////        Monitor monitor = new Monitor("Samsung","XX20",32);
//////        monitor.printInfo();
////        Motherboard mb = new Motherboard("ASUS");
////        Processor pr = new Processor("Intel Core M5y10","900MHz");
////        SysBlock sys =new SysBlock("Zenbook",pr,mb);
////
////
////        Computer dell = new Computer(monitor,sys,mouse,kb);
////        dell.printInfo();
////        System.out.println();
    }
}

