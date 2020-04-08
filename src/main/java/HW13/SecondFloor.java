package HW13;

public class SecondFloor implements Apartment {

    public String smallGarden;
    public int balcony;



    public SecondFloor(String smallGarden, int balcony) {
        this.smallGarden = smallGarden;
        this.balcony = balcony;
    }

    public SecondFloor() {
    }

    public void sf() {
        System.out.println("Second floor apartment has additional small garden and balcony");
    }

    public int Bedroom(){
        System.out.println();
        return Bedroom();
    }

    public int Bathroom (){
        System.out.println();
        return Bathroom();
    }

    public String getSmallGarden() {
        return smallGarden;
    }

    public void setSmallGarden(String smallGarden) {
        this.smallGarden = smallGarden;
    }

    public int getBalcony() {
        return balcony;
    }

    public void setBalcony(int balcony) {
        this.balcony = balcony;
    }

    @Override
    public int getBedroom() {
        System.out.println("2 Bedroom apartment on the second floor");
        return 2;
    }

    @Override
    public int getBathroom() {
        System.out.println("with 2 bathroom");
        return 2;
    }
}
