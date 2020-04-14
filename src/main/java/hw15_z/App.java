package hw15_z;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;


public class App {
    public static void main(String[] args) {
        ArrayList<String> transport = new ArrayList<String>();
        String[] arrData = {"Bus", "Metro", "Trolleybus", "Yacht"};
        out.println("\nI am using Foreach to print this: ");
        for (String strTemp : arrData) out.println(strTemp);

        transport.add("Bus");
        transport.add("Metro");
        transport.add("Trolleybus");
        transport.add("Yacht");
        out.println("List of transportation ");


        transport.add("bus");
        out.println(transport);
        transport.add("car");
        out.println(transport);
        transport.add("train");
        out.println(transport);
        transport.add(2, "airplaine");
        out.println(transport);
        transport.set(1, "taxi cab");
        out.println(transport);
//        System.out.println(transport.get(1));
        transport.remove(3);
        out.println(transport);
        transport.add("boat");
        transport.add("ferry");
//        transport.get(4);
        String element = transport.get(2);
        out.println("the element at index 2 is " + element);

        out.println(transport);
        out.println(transport.get(4));
//        transport.forEach((n)-> (transport));
        out.println("Popular transportation modes are: " + transport);
//        String v;
//        transport.forEach(String v:transport){
//            System.out.println(v);


        out.println(transport.get(2));
        out.println(transport.size());



        List<Shoes> shoes = new ArrayList<>();
        Shoes shoes1 = new Shoes("Espadrilles");

//        shoes1.addShoes(new Shoes("Flats"));
//        shoes1.addShoes("Heels");
//        shoes1.addShoes("Flip-flops");
//        shoes1.getShoes();

//        List<Shoes> shoes = new ArrayList<>();
//        var Shoes =new Shoes();
//        shoes.add("Flats");
//        shoes.add("Heels");
//        s1.add("Flip-flops");
//        System.out.println("List of shoes: "+s1);
//
//        System.out.println(shoes);
//        System.out.println(s1);

//        s1.remove(1);
//        System.out.println(s1);
//        String brogues = s1.set(2, "Brogues");
//        System.out.println(s1);
//        for (String shoes1 : s1) {
//            System.out.println("I am printing this via using foreach: " + s1);


        }
    }







