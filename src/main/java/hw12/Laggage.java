package hw12;

public class Laggage {
    private int carryout;
    private int laggage;

    public Laggage(int carryout, int laggage) {
        this.carryout = carryout;
        this.laggage = laggage;
    }
    public  void printInfo(){
        System.out.println("total laggage :" +carryout + laggage+" peaces" +
                "");
    }

    public int getCarryout() {
        return carryout;
    }

    public int getLaggage() {
        return laggage;
    }
}
