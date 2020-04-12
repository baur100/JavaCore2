package HW16P1;

import java.util.HashMap;

public class Work {
    public static void main(String[] args) {
        HashMap<String,String> exp = new HashMap<String,String>();
        HashMap<String,Double> valueComp = new HashMap<String,Double>();
        HashMap<Integer,String> coordinates = new HashMap<Integer, String>();

        for (Integer i = 0; i <10 ; i++) {

            exp.put(i.toString(), "   exp = " + Math.exp(i));
        }
        exp.replace(Integer.toString(5), Integer.toString(77));
        exp.forEach((x, y) -> print(x,y));
        System.out.println(exp.size());

        valueComp.put("Amazon", 55.3);
        valueComp.put("SpaceX", 27.7);
        valueComp.put("Google", 498.5);
        valueComp.put("Apple", 1013.6);

        System.out.println("Value " + valueComp.get("Google"));
// list exp(String, String) goes to List coordinates(Integer, String)
        for (Integer i = 0; i <= exp.size(); i++) {
            coordinates.put(i+10, exp.get(i.toString()));
        }
        coordinates.forEach((x,y) -> print(x.toString(),y));


    }
    public static void print(String x, String y){
        System.out.println(x + y);
       // System.out.println("");
    }

}
