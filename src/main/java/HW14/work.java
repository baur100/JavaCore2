package HW14;

public class work {
    public static void main(String[] args) {

        HW14.carnivoresPack.blueWhale newWhale = new HW14.carnivoresPack.blueWhale();
        HW14.carnivoresPack.wolf newWolf = new HW14.carnivoresPack.wolf();
        HW14.carnivoresPack.lion newLion = new HW14.carnivoresPack.lion();

        newWhale.canLiveBearing();
        newWolf.canBite();
        newWolf.canMove();
        newLion.canLiveBearing();


    }
}
