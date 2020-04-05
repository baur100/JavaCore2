package homework13;
//Создайте интерфейс и 2 класса которые его имплементируют
//Создайте по 2 объекта каждого класса типа Интерфейса

public class Work {
    public static void main(String[] args) {
//        1 задание

        IntDoors door1 = new IntDoors("Int", 32, "Wood", "4 panel", "White");
        Doors door2 = new Doors("Ext", 36, "Metal");
        ExtDoors door3 = new ExtDoors("Ext", 36, "Metal", "with glass", "Blk");


        door1.scream();
        door2.scream();
        door1.lock();
        door2.open();
        door3.lube();
    }
}
