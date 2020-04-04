package hWA12;

public class Work {
    public static void main(String[]args){

        Motor planeMotor = new Motor(1800,"hidrawlique","Airbus");
        Plane myPlane = new Plane(6,24000,"Passenger","vodka",24,80,planeMotor);
        Transport transport=new Transport (2,1800000,"AirPlane", "kerasine");

        System.out.println(myPlane.toString());
        System.out.println(myPlane.getPrice());

        Boat myBoat = new Boat(1200000,"leasure","GAS","super spead rodster");
        System.out.println(myBoat.toString());
        System.out.println("it s a "+myBoat.getType()+" boat");

    }
}
