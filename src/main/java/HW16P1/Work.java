package HW16P1;

import java.util.HashMap;
import java.util.Map;

public class Work {
    public static void main(String[] args) {
        HashMap<String,String> exp = new HashMap<String,String>();
        HashMap<String,Double> valueComp = new HashMap<String,Double>();
        HashMap<Integer,String> coordinates = new HashMap<Integer, String>();
        Map<Companies, Offices> companies = new HashMap<Companies, Offices>();



        //  exp example
        for (Integer i = 0; i <10 ; i++) {

            exp.put(i.toString(), "   exp = " + Math.exp(i));
        }
        exp.replace(Integer.toString(5), Integer.toString(77));
        exp.forEach((x, y) -> print(x,y));
        System.out.println(exp.size());
        //valueComp example
        valueComp.put("Amazon", 55.3);
        valueComp.put("SpaceX", 27.7);
        valueComp.put("Google", 498.5);
        valueComp.put("Apple", 1013.6);

        System.out.println("Value " + valueComp.get("Google"));

        // map classes example
        companies.put(new Companies("Amazon",65423), new Offices("Amazon", "Texas"));
        companies.put(new Companies("SpaceX",252), new Offices("SpaceX", "somewhere in CA"));
        companies.put(new Companies("Apple",224352), new Offices("Apple", "Cupertino"));
        Companies google = new Companies("Google", 876334);
        Offices googleOffice = new Offices("Google","Silicon Valley in CA");
        printHash(companies);

        companies.put(google, googleOffice);
        printHash(companies);

        companies.replace(google, new Offices("Yandex", "MSK"));
        printHash(companies);

        System.out.println("");



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

    public static void printHash(Map x){
        System.out.println("");

        x.forEach((a,b) -> System.out.println(a.toString()+ " " + b.toString()));

    }

}
