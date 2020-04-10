package hWA7;

public class Sum {
    public static int sum(int[] list1) {
        int summa =0;
        for (int x : list1) {
            summa = summa + x;
        }
        return summa;
    }
}
