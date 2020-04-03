package hw7;

public class HW7 {
    public static void main(String[] args) {
        System.out.println("***SUM***");
        int res1 = sum(2, 3, 5, 6, 7, 8);
        System.out.println(res1);
        System.out.println("***SORT***");



        System.out.println("***MIN***");
        int resmin = min(3, 9, 1, 8, 4, 8, 5);
        System.out.println(resmin);
        System.out.println("***MAX***");
        int res2 = max(3, 9, 1, 18, 4, 8, 5);
        System.out.println(res2);

    }

    public static int sum(int a, int b, int c, int d, int e, int f) {
        int sum = a + b + c + d + e + f;
        return sum;
    }
    public static int min(int a, int b, int c, int d, int e, int f, int g) {
        int[] arr = new int[]{a, b, c, d, e, f, g};
        int min = arr[0];
        for (int v : arr) {
            if (v < min) {
                min = v;
            }
                   }
        return min;
    }
    public static int max(int a, int b, int c, int d, int e, int f, int g) {
        int[] arr = new int[]{a, b, c, d, e, g};
        int max = arr[0];
        for (int v : arr) {
            if (v > max) {
                max = v;
            }
        }
        return max;
    }
}
