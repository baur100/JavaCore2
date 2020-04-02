package hw10;

public class Work10 {
    public static void main(String[] args) {
        Bicycle huffy = new Bicycle();
        huffy.setBrand("Huffy");
        huffy.setColor("red");
        huffy.setPrice(119.99);
        Bicycle aero = new Bicycle("Aero", "black", 239.19);
        System.out.println(aero.getBrand());
        System.out.println(huffy.getPrice());

        huffy.ride();
        aero.ride();

        Doctor alex =new Doctor("Alex","cardiolog",35);
        Doctor oleg = new Doctor("Oleg","surgeon",40);
        alex.printDoctorInfo();
        oleg.printDoctorInfo();

        var tree=new Tree("Maple",0.0,200);
        tree.printHeight();

        Tree tree1=new Tree ("Palm",80.5,25);
        tree1.printHeight();
        tree1.setHeight(80.5);
    }
}

