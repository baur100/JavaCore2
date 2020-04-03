package hw10;

public class Work10 {
    public static void main(String[] args) {
        Bicycle huffy = new Bicycle();
        huffy.setBrand("Huffy");
        huffy.setColor("red");
        huffy.setPrice(119.99);
        int[]z={10,20,30};
        Bicycle aero = new Bicycle();
        aero.setBrand("Aero");
        aero.setColor("black");
        aero.setPrice(239.19);
        aero.setSize(z);

        System.out.println(aero.getBrand());
        System.out.println(huffy.getPrice());

        huffy.ride();
        aero.ride();
        int[] f1={2,3,5};
        Doctor alex =new Doctor("Alex","cardiolog",35,f1);
        int[]f2={2,8,5,4};
        Doctor oleg = new Doctor("Oleg","surgeon",40,f2);
        alex.printDoctorInfo();
        oleg.printDoctorInfo();
        alex.setFloor(f1);

        var tree=new Tree("Maple",0.0,200);
        tree.printHeight();

        Tree tree1=new Tree ("Palm",80.5,25);
        tree1.printHeight();
        tree1.setHeight(80.5);
    }
}

