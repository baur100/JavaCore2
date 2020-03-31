package hw7_2;

public class task3 {
    public static int [] minimax (int [] list3) {
        int max = list3[0];
        int min = list3[0];
        for (int v : list3) {
            if (v > max) {
                max = v;
            }
            if (v < min) {
                min = v;
            }
        }
        return new int[]{max,min};

    }
}
