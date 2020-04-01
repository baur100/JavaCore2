package HW10;

public class work {
    public static void main(String[] args) {

        String[] merch = {"Books,", "Audio,", "Products,"};
        amazon amzFull = new amazon("Jeff Bezos", 949.76, merch);
        amazon amzDef = new amazon();
        amzDef.setFounder("Jeff");
        amzDef.setValue(912.3);
        amzDef.setSubDivision(merch);
        amzDef.printClass();

        String[] devices = {"iPhone,", "iPad,", "iPod,"};
        apple appleFull = new apple("Steve Jobs", 998.2, devices);
        apple appleDef = new apple();
        appleDef.setFounder("Steve");
        appleDef.setValue(1082.3);
        appleDef.setProducts(devices);
        appleDef.printClass();

        String[] vessels = {"Falcon 9,", "Super Heavy,", "Star Ship,"};
        spaceX spaceXFull = new spaceX("Elon Musk", 33.4, devices);
        spaceX spaceXDef = new spaceX();
        spaceXDef.setFounder("Elon");
        spaceXDef.setValue(27.3);
        spaceXDef.setVessel(vessels);
        spaceXDef.printClass();
    }
}
