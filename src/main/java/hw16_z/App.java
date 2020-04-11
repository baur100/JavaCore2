package hw16_z;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args){
        Map<String,String> nationality=new HashMap<>();
        nationality.put("Jordan","american");
        nationality.put("Ivan","russian");
        nationality.put("Ayaz","azerbaijani");
        nationality.put("Jose","mexican");
        nationality.put("Zelda","danish");
//        System.out.println(nationality);
//        nationality.replace("Ayaz","tatar");
//        System.out.println(nationality);
//        System.out.println(nationality.get("Ivan"));
//        nationality.remove("Jose","mexican");
//        nationality.remove("Ivan");
//        System.out.println(nationality);
//
//        System.out.println(nationality.size());
//        nationality.containsKey("german");

        for (Map.Entry<String,String> kv:nationality.entrySet()) {
            System.out.println(kv.getKey());
            System.out.println(kv.getValue());

            System.out.println("-------------");
        }
        for (String key:nationality.keySet()){
            System.out.println(key);
        }






    }
}
