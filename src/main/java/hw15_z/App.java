package hw15_z;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> transport = new ArrayList<String>();

        transport.add("bus");
        System.out.println(transport);
        transport.add("car");
        System.out.println(transport);
        transport.add("train");
        System.out.println(transport);
        transport.add(2,"airplaine");
        System.out.println(transport);
        transport.set(1,"taxi cab");
        System.out.println(transport);
//        System.out.println(transport.get(1));
        transport.remove(3);
        System.out.println(transport);
        transport.add("boat");
        transport.add("ferry");
        transport.get(4);
        System.out.println(transport);
        System.out.println(transport.get(4));
        transport.forEach();

//        System.out.println(transport.get(2));
//        System.out.println(transport.size());
    }
}
