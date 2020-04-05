package homework12;

public class App {
    public static void main(String[] args) {
        Furniture f1=new Furniture("Malasia", "Dana", "indoor", "made on fabric");
        Sofa s1=new Sofa("USA", "Ikea", "indoor", "made on fabric", "futon", 500);

        System.out.println(s1.getBrand());
        s1.printInfo();

        f1.printInfo();
        System.out.println(s1.getType());

        Desk wdesk= new Desk("China", "Ikea", "indoor", "made on fabric", "plastic","work");
        System.out.println(wdesk.getPurpose());
        System.out.println(wdesk.toString());
    }
}
