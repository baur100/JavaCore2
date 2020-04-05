package hv13;

public class App {
    public static void main(String[] args) {
        BikeHolder bh1=new BikeHolder("Uhau",150,"BH1");
        Traller small= new UtilityTraller(12,700,"wood");
        Traller jetski = new BoatTraller(10,900, 2);

        bh1.standartBallSize();
        small.standartBallSize();
        jetski.standartBallSize();

    }
}
