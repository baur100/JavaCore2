package hWA16;

import java.util.HashMap;
import java.util.Map;

public class Work {
    public static void main(String[]args){
        Map<String,String> colorfullfruits = new HashMap<>();
        colorfullfruits.put("mango","yellow");
        colorfullfruits.put("pear","green");
        colorfullfruits.put("strawberry","red");
        colorfullfruits.put("graips","green");
        System.out.println(colorfullfruits.size());
        colorfullfruits.replace("graips","purple");
        colorfullfruits.get("graips");
        colorfullfruits.remove("mango");
        System.out.println(colorfullfruits.size());

        for (Map.Entry<String,String> kv:colorfullfruits.entrySet()){
            System.out.print(kv.getKey()+" = ");
            System.out.println(kv.getValue());
        }

        for (String key: colorfullfruits.keySet()){
            System.out.println(key);
        }

        for (String value:colorfullfruits.values()){
            System.out.println(value);
        }

        Map<Integer,String> rooms = new HashMap<>();
        rooms.put(1,"entrance");
        rooms.put(2, "gestWC");
        rooms.put(3,"salon");
        rooms.put(4,"bedrooms");
        System.out.println(rooms.size());
        for (Map.Entry<Integer,String> kv:rooms.entrySet()){
            System.out.print(kv.getKey()+" = ");
            System.out.println(kv.getValue());
        }
        rooms.replace(1,"salon");

        for (Integer key: rooms.keySet()){
            System.out.println(key);
        }
        rooms.remove(4);

        for (String value:rooms.values()){
            System.out.println(value);
        }

        Artist artist1=new Artist("Vasiliy","Petrov-Vodkin");
        ArtPies artPies1 = new ArtPies(1924,ArtType.PORTRAIT,"Burlaki na Volge");

        Artist artist2=new Artist("Vasiliy","Petrov-Vodkin");
        ArtPies artPies2 = new ArtPies(1928,ArtType.PORTRAIT,"My neighbor");

        Artist artist3=new Artist("Kozimir","Malevisch");
        ArtPies artPies3 = new ArtPies(1931,ArtType.LANDSCAPE,"Abstraction1");

        Artist artist4=new Artist("Diaccomo","Carovadgy");
        ArtPies artPies4 = new ArtPies(1861,ArtType.NATURMORT,"After hunting");

        Artist artist5=new Artist("Valter","Malevitch");

        Map<Artist,ArtPies> exponate=new HashMap<>();
        exponate.put(artist1,artPies1);
        exponate.put(artist2,artPies2);
        exponate.put(artist3,artPies3);
        exponate.put(artist4,artPies4);
        System.out.println(exponate.size());
        for (Map.Entry<Artist,ArtPies> kv:exponate.entrySet()){
            System.out.println( kv.getKey().ptintInfo()+" = "+ kv.getValue().printInfo());
        }
        exponate.replace(artist4,artPies1);
        System.out.println(exponate.size());

        for (ArtPies value:exponate.values()){
            System.out.println(value.printInfo());
        }
        exponate.remove(artist4);
        System.out.println(exponate.size());

        for (Artist key: exponate.keySet()){
            System.out.println(key.ptintInfo());
        }






    }
}
