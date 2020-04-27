public class Lesson8 {
    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        int xx = sum(1, 3, 2);
        int zz = sum(1, 1, 2, 2);
        String str = sum("abc", "cde", "ddd");
        System.out.println(str);
        System.out.println(sum("ddd", "eee", 555));
        System.out.println(sum("ddd", "555"));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double x, double z) {
        return x + z;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static double sum(double x, double z, double y) {
        return x + z + y;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static double sum(double x, double z, double y, double a) {
        return x + z + y + a;
    }

    public static String sum(String a, String b) {
        return a + b;
    }

    public static String sum(String a, String b, String c) {
        return a + b + c;
    }

    public static String sum(String a, String b, int c) {
        return a + b + c;
    }
}
