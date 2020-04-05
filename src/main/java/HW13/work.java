package HW13;

public class work {
    public static void main(String[] args) {


        gameBuilder setup = new gameSetup();
        gameBuilder posSetup = new gameSetup();
        gameBuilder option1 = new gameOpt();
        gameBuilder option2 = new gameOpt();

        setup.shipPositionCalc();
        posSetup.getShipCoordinate();

        option1.getShipCoordinate();
        option2.shipPositionCalc();


    }
}
