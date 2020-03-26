package hw7;

public class HomeworkThird {
    public static int[] minMax(int[] minMax) {
        int max = minMax[0];
        int min = minMax[0];
        for (int value : minMax) {
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }
        return new int[]{max, min};
    }
}
