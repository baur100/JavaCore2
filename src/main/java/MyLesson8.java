public class MyLesson8 {
    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        int xx = sum(1, 2, 3, 4);
        int zz = sum(1, 2, 3, 4);
        String str = sum("abc", "cde");
        double db = sum(12, 32, 44.42, 42.44);
        System.out.println(xx);
        System.out.println(zz);
        System.out.println(str);
        System.out.println(db);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double x, double y) {
        return x + y;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static double sum(double x, double y, double z, double a) {
        return x + y + z + a;
    }

    public static String sum(String a, String b) {
        return a + b;
    }
}
