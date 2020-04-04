package hw12;


public class App {
    public static void main(String[] args) {

        TV tv1 =new TV();
        SmartTV tv2=new SmartTV("LG","L222",55,"Wi-Fi Certified 802.11ac","webOS");
        TV3D tv3= new TV3D("Sony","s34",40,"yes","yes");
        SmartBlueray tv4=new SmartBlueray("Sharp","Sh55",80,"YES","Y","Sony","S333");

        tv3.prinCondition();
        System.out.println(tv2.getName());
        System.out.println(tv3.getSize());
        System.out.println(tv4.getBlurayBrand());

        System.out.println();

        Pilot pilot =new Pilot("Ivan","Ivanov", 25);
        Stuards stuards=new Stuards("Petya","Petrov",5);
        Laggage laggage = new Laggage(22,67);
        Passanger p1= new Passanger(22,44);
        Plane lf232=new Plane(pilot,stuards,laggage,p1);

        System.out.println(lf232.getPp().getLastName());
        System.out.println(lf232.getSs().getName());
    }
}