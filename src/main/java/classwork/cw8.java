package classwork;

public class cw8 {
    public static void main(String[] args) {
        System.out.println(sum(4, 5, 6));
        System.out.println(sum("str", "STR"));

    }

    public static double sum(double x, double z) {
        return x + z;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static String sum(String a, String b){
        return a + b;
    }
}
