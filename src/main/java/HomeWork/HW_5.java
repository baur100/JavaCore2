package HomeWork;

public class HW_5 {
    public static void main(String[] args) {

        int a =5;
        int b=8;
        sum(a,b);

        System.out.println();

        int result = sum1(5,5);
        System.out.println(result);

        System.out.println();

        System.out.println(isOdd(67));
        System.out.println(isOdd(68));

    }

    public static void sum(int a, int b) {
        System.out.println(a+b);

    }

    public static int sum1(int c, int e) {
        int sum = c + e;
        return sum;

    }

    public static boolean isOdd(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
