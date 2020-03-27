package hW7;

public class Sum {
    public static int sum(int[] list) {
        int summa = 0;
        for (int x : list) {
            summa = summa + x;
        }
        return summa;
    }
}
