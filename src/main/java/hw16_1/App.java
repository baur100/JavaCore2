package hw16_1;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        Map<String,String>cleaning = new HashMap<>();

        cleaning.put("Room#5275", "Clorox");
        cleaning.put("Hallways", "IPA");
        cleaning.put("Room#1029", "IPA");
        cleaning.put("Small meeting room", "Clorox");

        System.out.println(cleaning.keySet());

        cleaning.replace("Hallways", "Clorox");
        System.out.println(cleaning.get("Hallways"));

        cleaning.remove("Room#1029");
        for (Map.Entry <String,String> x :cleaning.entrySet()) {
            System.out.println(x.getKey());
            System.out.println(x.getValue());
        }

        Map<String,Integer>food = new HashMap<>();

        food.put("Chicken", 579);
        food.put("Turkey", 321);
        food.put("Duck", 116);
        food.put("Veal", 251);

        System.out.println(food);
        System.out.println(food.get("Chicken"));
        System.out.println(food.size());

        food.replace("Veal", 255);

        for (String key : food.keySet()) {
            System.out.println(key);
        }
        for (Integer value: food.values()) {
            System.out.println(value);
        }


        Map<Pharmacist,Medicines>prescription = new HashMap<>();

        Pharmacist p1 = new Pharmacist("L. Moon");
        Pharmacist p2 = new Pharmacist("J. Smith");
        Pharmacist p3 = new Pharmacist("S. McMaster");
        Pharmacist p4 = new Pharmacist("H. Lee");

        Medicines m1 = new Medicines("VitaMax Super");
        Medicines m2 = new Medicines("Ibuprofen 600 mg");
        Medicines m3 = new Medicines("Tylenol Syrup Kid");
        Medicines m4 = new Medicines("CHG 4% ointment");

        prescription.put(p1,m1);
        prescription.put(p2,m2);
        prescription.put(p3,m1);
        prescription.put(p4,m3);

        System.out.println(prescription);
        System.out.println(prescription.get(p1));

        prescription.remove(p4,m3);
        System.out.println(prescription.size());

        prescription.put(p1,m4);

        System.out.println(prescription.get(p1));

        System.out.println(prescription.keySet());

    }
}
