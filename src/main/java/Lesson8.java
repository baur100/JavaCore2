public class Lesson8 {

    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        int xx = sum(1, 2, 3);
        int zz = sum(1, 2, 3, 2);
        String str = sum("abc", "cde", "ddd");
        System.out.println(str);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double x, double y, double z) {
        return x + y + z;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;

    }

    public static String sum(String a, String b, String c) {
        return a + b + c;

    }
}