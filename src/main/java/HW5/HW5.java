package HW5;

public class HW5 {


    public static void main(String[] args) {
        System.out.println(isOdd(88));

        int[]num1 = {10,20};
        System.out.println (sum(num1[0],num1[1]));

        int a = 30;
        int b = 40;
        System.out.println (sum(a,b));


    }

    public static int sum(int a, int b) {
        return a + b;
    }


    public static boolean isOdd(int x) {
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }


    }
}






