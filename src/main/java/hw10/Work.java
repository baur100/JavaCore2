package hw10;

public class Work {
    public Work() {
    }

    public static void main(String[] args) {
        var myPen = new Pen();
        myPen.setInkColor("Blue");
        myPen.setPenColor("White");
        myPen.setPrice(1);
        myPen.setNibSize(5);
        myPen.printClass();

        Pen herPen = new Pen ("Black", 6, "Orange", 2);
        herPen.printClass();

        Dress workDress = new Dress();
        workDress.setType("Office");
        workDress.setColor("Grey");
        workDress.setSize(4);
        workDress.setPrice(45);
        workDress.printClass();

        Dress partyDress = new Dress("Coctail", "Red", 6, 89);
        partyDress.printClass();

        Bookcase forOffice = new Bookcase();
        forOffice.setMaterial("Wood");
        forOffice.setPrice(560);
        forOffice.setDimensions(40, 50, 60);
        forOffice.printClass();

        int[] dimensions = new int[] {14,20,24};
        Bookcase cornerBookcase = new Bookcase("Metal", dimensions, 75);
        cornerBookcase.printClass();

}

    }