package homewor15;
//Создайте 3 ArrayList - String, Integer и произвольного класса (придумайте сами)
//добавьте в каждый ArrayList по 4 элемента
//попробуйте методы add/set/remove/get/foreach


import java.util.ArrayList;
import java.util.List;

public class Work {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();

// Добавление элементов "add"
        colors.add("Red");
        colors.add("Pink");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("PINK");
        colors.add("RED");
        colors.add("Pink");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("PINK");


        System.out.println(colors);

//  Добавить элемент в любое место

        colors.add(6, "Rainbow");
        System.out.println(colors);


// Замена элемента 4 с GREEN на WHITE "set"
        colors.set(4, "WHITE");
        System.out.println(colors);

//  Удаление элемента по индексу "remove"
        colors.remove(2);
        System.out.println(colors);

//  Удаление элемента по содержимому(имени или значению) "remove"
        colors.remove("Pink");
        System.out.println(colors);

// Эллемент добавляется в конец списка
        colors.add("FUXI");
        System.out.println(colors);

// Есть ли в списке такое значение

        System.out.println(colors.contains("Green"));
        System.out.println(colors.contains("Oh-ho-ho"));

// Напечатать размер массива
        System.out.println(colors.size());

//  Получить значение по индексу
        System.out.println();
        System.out.println(colors.get(2));
        System.out.println();
// Напечатать на одной строчке каждый элемент
        colors.forEach(x -> System.out.println(x));// или такой вид colors.forEach(System.out::println);

//  Удалить элемент по индексу или содержимому
        colors.remove("FUXI");
        System.out.println(colors);

//        Integers
        List<Integer> chisla = new ArrayList<>();

        chisla.add(1);
        chisla.add(2);
        chisla.add(3);
        chisla.add(6);

        System.out.println(chisla);

        chisla.set(3, 7);

        System.out.println(chisla);

        System.out.println(chisla.get(2));

        chisla.remove(2);
        System.out.println(chisla);

//        Bulbs
        List<Bulbs> bulbs = new ArrayList<>();

        Bulbs bulb1 = new Bulbs("LED", "Indoor", 800);
        Bulbs bulb2 = new Bulbs("Origin", "Outdoor", 600);
        Bulbs bulb3 = new Bulbs("Flourecence", "Indoor", 500);

        List<Bulbs> lamps = new ArrayList<>();
        lamps.add(bulb1);
        lamps.add(bulb2);
        System.out.println(lamps.size());
        System.out.println(lamps.get(1));
        System.out.println(lamps);
        lamps.set(1,bulb3);
        System.out.println(lamps);

    }
}
