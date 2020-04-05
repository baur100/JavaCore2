package HW13;

public class App {
    public static void main(String[] args) {
        Tesla tesla = new Tesla(2010);
        tesla.speed();
        ToyotaPrius toyotaPrius = new ToyotaPrius();
        toyotaPrius.speed();

        Tesla tesla1 = new Tesla(2000);
        tesla.color();
        ToyotaPrius toyotaPrius1 = new ToyotaPrius();
        toyotaPrius.color();

        TeslaXX teslaXX = new TeslaXX(10);
        Car[] h1 = {tesla, teslaXX}; //Polimorthizm
        //we can give parent values from child class
        Car vv = teslaXX;
    }
}
