package hw16;

import java.util.HashMap;
import java.util.Map;

public class Work {
    public static void main(String[] args) {
        // <String, String>
        Map<String, String > movie= new HashMap<>();
        movie.put("Cameron","Terminator");
        movie.put("Lucas", "Star Wars");
        movie.put("Jackson","The Lord of The Ring");
        movie.put("Tarantino","Django Unchained");

        System.out.println(movie);
        System.out.println(movie.size());
        movie.replace("Cameron","Titanic");
        System.out.println(movie);
        movie.put("Spielberg","Jurassic Park");
        System.out.println(movie);
        System.out.println(movie.size());
        System.out.println(movie.get("Lucas"));
        movie.remove("Jackson");
        System.out.println(movie);

        for (Map.Entry<String,String>xx:movie.entrySet()) {
            System.out.println(xx.getKey());
            System.out.println(xx.getValue());
        }
        // <Integer, String>
        Map<Integer,String> names= new HashMap<Integer, String>();
        names.put(1,"Peter");
        names.put(2,"Michael");
        names.put(3,"John");
        names.put(4,"Alex");

        System.out.println(names);
        System.out.println(names.size());
        names.replace(1,"Anthony");
        System.out.println(names);
        names.put(5,"George");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.get(1));
        names.remove(3);
        System.out.println(names);

        // Class1, Class2
        Map<String, String> map= new HashMap<>();
        map.put("California","Sacramento");
        map.put("New York","Albany");
        map.put("Texas","Austin");
        map.put("Arizona","Phoenix");
        System.out.println(map);
        System.out.println(map.size());
        map.replace("Arizona","Tuscon");
        System.out.println(map);
        map.put("Oregon","Salem");
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get("California"));
        map.remove("Arizona");
        System.out.println(map);





    }
}
