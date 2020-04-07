package hw13;

public class App {
//    Создайте интерфейс и 2 класса которые его имплементируют
//    Создайте по 2 объекта каждого класса типа Интерфейса

    public static void main(String[] args) {

        Flower rose = new Flower("rose", "flower");
        rose.bloom();

        Fruit peach = new Fruit("peach", "fruit");
        peach.bloom();

    }
}
