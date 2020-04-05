package HW12_task1;

public class App {
    public static void main(String[] args) {
//        1. Создать один супер и 2 или 3 детских
//        создать объекты

        int[] chairSize = new int[]{10,20,30};
        Furniture highChair = new Chair("Graco", "FIX333", chairSize, "gray");
        System.out.println("This highchair model is "+highChair.getModel());
        highChair.printDimensions();
        System.out.println("\n-------------------");

        int[] shkafeSize = new int[]{100,50,150};
        Furniture shkaf = new Dresser("Ikea","dr555",shkafeSize, "white");
        System.out.println("This dresser color is "+shkaf.getColor());
        shkaf.printDimensions();
        System.out.println("\n-------------------");

        int[] bedSize = new int[]{180,200,60};
        Furniture bed = new Bed("Ikea", "eee22",bedSize,"brown");
        System.out.println("This bed is produced by "+bed.getManufacturer());



    }
}
