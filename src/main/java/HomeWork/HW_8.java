package HomeWork;

public class HW_8 {
    public static void main(String[] args) {

        Refrigerator fridge = new Refrigerator();
        fridge.brand = "Samsung";
        fridge.color = "Stainless steel";
        fridge.model = 45;
        fridge.price = 5000;
        fridge.printInfo();
        fridge.freeze();
        fridge.makeShoppingList();
        fridge.storeFood();


        Flower flower = new Flower();
        flower.color = "Red";
        flower.name = "Rose";
        flower.type = "perenerial";
        flower.stems = "Spiky";
        flower.pollinate();


        Teacher teacher = new Teacher();
        teacher.name = "Tammy";
        teacher.lastName = "luna";
        teacher.id = 123;
        teacher.email = "luna@gmail.com";
        teacher.printInfo();
        teacher.conductsLessons();

        Printer printer =new Printer();
        printer.brand = "HP";
        printer.color = "black";
        printer.scanDoc();
    }

}
