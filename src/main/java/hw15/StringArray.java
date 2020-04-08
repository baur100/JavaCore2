package hw15;

import java.util.ArrayList;
import java.util.List;

public class StringArray {
    public static void main(String[] args) {

        //попробуйте методы add/set/remove/get/foreach

        List<String> menu = new ArrayList<>();
        menu.add("hamburger");
        menu.add("cheeseburger");
        menu.add("french fries");
        menu.add("soda");
        System.out.println(menu);
        System.out.println(menu.size());

        menu.add(1,"big mak");
        menu.add(4, "soda");
        System.out.println(menu);
        System.out.println(menu.size());

        menu.set(0, "nuggets");
        System.out.println(menu);
        System.out.println(menu.size());

        menu.remove(2);
        System.out.println(menu);
        System.out.println(menu.size());

        menu.remove("soda");
        System.out.println(menu);
        System.out.println(menu.size());


        System.out.println(menu.get(0));

        menu.forEach(x-> System.out.println(x));


    }
}
