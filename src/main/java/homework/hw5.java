package homework;

public class hw5 {
    public static void main(String[] args) {
        int a = 15;
        int b = 28;

        sum(a, b);

        int task2 = sum2(a, b);
        System.out.println(task2);

        boolean task3 = isOdd(a);
        System.out.println(task3);


    }

    public static void sum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static int sum2(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static boolean isOdd(int c) {
        if (c % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
