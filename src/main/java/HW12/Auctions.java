package HW12;

public class Auctions {
    public static void main(String[] args) {
        Car bmw = new Car("BMW","X5",2020,67000,"Black","SUV");
        Neibor jonh = new Neibor("Mersedes","c300",2007,4000);
        Tractor tr = new Tractor("GRT","tu-67",
                2011,47000,"yeloww","stair","4500lb","3780lb");
        Truck gms = new Truck("GMC","Sierra",2019,46000,"Red","Long","2500Lb");
        System.out.println("Licsting today:");
        System.out.println(bmw);
        System.out.println(jonh);
        System.out.println(tr);
        System.out.println(gms);
    }
}
