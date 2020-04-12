import java.util.ArrayList;
import java.util.List;

public class hWAMaxNumberInArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(23);
        list.add(32);
        list.add(88);
        list.add(98);

            int max = list.get(0);
            for (int xx : list) {


                for (int i = 1; i < list.size(); i++) {
                    if (max < xx) {
                        max = xx;
                    }

                }

            }
            System.out.println(max);
        }
    }



