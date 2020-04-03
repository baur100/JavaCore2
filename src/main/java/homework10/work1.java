package homework10;

public class work1 {
    public static void main(String[] args) {

        String[] merch = {"Books,", "Audio,", "Products,"};
        amazon amzFull = new amazon("Jeff Bezos", 949.76, merch);
        amazon amzDef = new amazon();
        amzDef.setFounder("Jeff");
        amzDef.setValue(912.3);
        amzDef.setSubDivision(merch);
        amzDef.printClass();
    }
}
