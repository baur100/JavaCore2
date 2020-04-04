package hWA12;

public class Plane extends Transport {
    protected int quantOfIlluminators;
    protected int quantOfHoursOnAir;
    protected Motor motor;

    public Plane(int quantityOfWheels, int price, String type, String fuel, int quantOfIlluminators, int quantOfHoursOnAir, Motor motor) {
        super(quantityOfWheels, price, type, fuel);
        this.quantOfIlluminators = quantOfIlluminators;
        this.quantOfHoursOnAir = quantOfHoursOnAir;
        this.motor=motor;
    }


    public int getQuantOfIlluminators() {
        return quantOfIlluminators;
    }

    public int getQuantOfHoursOnAir() {
        return quantOfHoursOnAir;
    }
    public Motor getMotor() {
        return motor;
    }

    public String toString(){
        return"Plane with: "+quantityOfWheels+" wheels, \ntype of plane: "+type+", \nquantity of H on air: "+quantOfHoursOnAir+",\nprice: "+price +",\nMotor:"+motor.toString();
    }
}
