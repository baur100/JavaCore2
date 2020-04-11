package HW16first;

import java.util.HashMap;
import java.util.Map;

public class AppInt {
    public static void main(String[] args) {
        Map<Integer,String> home = new HashMap<>();
        home.put(1,"Apt");
        home.put(2,"Condo");
        home.put(3,"Townhouse");
        home.put(4,"House");
        System.out.println(home);

        home.replace(2,"Familyhouse");
        System.out.println(home);

        home.remove(2);
        System.out.println(home);

        System.out.println(home.get(4));

        for (Integer key: home.keySet()){
            System.out.println(key);
        }
        for (String value: home.values()){
            System.out.println(value);
        }
    }
}
