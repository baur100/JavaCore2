package hw15_z;

import java.util.ArrayList;


public class App {
    public static void main(String[] args) {
        ArrayList<String> transport = new ArrayList<String>();
        String[] arrData = {"Bus", "Metro", "Trolleybus", "Yacht"};
        System.out.println("\nI am using Foreach to print this: ");
        for (String strTemp : arrData) System.out.println(strTemp);

        transport.add("Bus");
        transport.add("Metro");
        transport.add("Trolleybus");
        transport.add("Yacht");
        System.out.println("List of transportation ");


        transport.add("bus");
        System.out.println(transport);
        transport.add("car");
        System.out.println(transport);
        transport.add("train");
        System.out.println(transport);
        transport.add(2, "airplaine");
        System.out.println(transport);
        transport.set(1, "taxi cab");
        System.out.println(transport);
//        System.out.println(transport.get(1));
        transport.remove(3);
        System.out.println(transport);
        transport.add("boat");
        transport.add("ferry");
//        transport.get(4);
        String element = transport.get(2);
        System.out.println("the element at index 2 is " +element);

        System.out.println(transport);
        System.out.println(transport.get(4));
//        transport.forEach((n)-> (transport));
        System.out.println("Popular transportation modes are: " + transport);
//        String v;
//        transport.forEach(String v:transport){
//            System.out.println(v);


            System.out.println(transport.get(2));
            System.out.println(transport.size());
        }
    }
