package HW13;

public class FirstFloor implements Apartment {


    private String garage;
    private String patio;


    public int Bedroom(){
        System.out.println();
        return Bedroom();
    }

    public int Bathroom (){
        System.out.println();
        return Bathroom();
    }

    public FirstFloor(String garage, String patio) {
        this.garage = garage;
        this.patio = patio;
    }

    public FirstFloor() {
    }
    public void ff () {
        System.out.println("First floor apartment has additional garage and patio");
    }

    public String getGarage() {
        return garage;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    public String getPatio() {
        return patio;
    }

    public void setPatio(String patio) {
        this.patio = patio;
    }

    @Override
    public int getBedroom() {
        System.out.println("3 Bedroom apartment on the first floor");
        return 3;
    }

    @Override
    public int getBathroom() {
        System.out.println("with 3 bathroom");
        return 3;
    }
}

