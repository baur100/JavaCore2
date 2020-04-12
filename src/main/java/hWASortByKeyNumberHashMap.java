import java.util.*;

public class hWASortByKeyNumberHashMap {
    public static void main(String[] args) {
        Map<Integer, String> list = new HashMap<>();
        list.put(2, "a");
        list.put(4, "k");
        list.put(8, "z");
        list.put(1, "h");
        List<Integer> listByKey = new ArrayList<>(list.keySet());
        Collections.sort(listByKey);
        for(Integer xx:listByKey){
            System.out.println(xx);
        }
        Map<Integer, String> listOne = new HashMap<>();

        for (Integer i = 0; i < listByKey.size(); i++) {

            listOne.put(listByKey.get(i), list.get(listByKey.get(i)));


        }
        for (Map.Entry<Integer, String> kv : listOne.entrySet()) {
            System.out.println(kv.getKey()+" " +kv.getValue());

        }
    }
}
