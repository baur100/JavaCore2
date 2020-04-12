package HW14;
import HW14.carnivoresPack.lion;
import HW14.carnivoresPack.blueWhale;
import HW14.carnivoresPack.wolf;
public class work {
    public static void main(String[] args) {

        blueWhale newWhale = new HW14.carnivoresPack.blueWhale();
        wolf newWolf = new HW14.carnivoresPack.wolf();
        lion newLion = new HW14.carnivoresPack.lion();

        newWhale.canLiveBearing();
        newWolf.canBite();
        newWolf.canMove();
        newLion.canLiveBearing();


    }
}
