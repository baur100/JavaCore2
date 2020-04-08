package homewor15;
//Создайте 3 ArrayList - String, Integer и произвольного класса (придумайте сами)
//добавьте в каждый ArrayList по 4 элемента
//попробуйте методы add/set/remove/get/foreach


import java.util.ArrayList;
import java.util.List;

public class Work {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        String[] colors1 = new String[10];
// Добавление элементов "add"
        colors.add("RED");
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


    }
}
