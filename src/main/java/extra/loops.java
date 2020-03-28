package extra;

public class loops {
    public static void main(String[] args) {

        int a = 5;
        int b = -5;
        int c = 0;
        System.out.println(factorialFunc(a));
        System.out.println(factorialFunc(b));
        System.out.println(factorialFunc(c));

        System.out.println();

        System.out.println(fact(a));
        System.out.println(fact(c));


    }

    public static void recursiveFunc() {
        System.out.println("Hello, recursiveFunc");
        recursiveFunc();
    }

    public static Integer factorialFunc(int n) {
        if (n < 0) {
            System.out.println("Зачем тебе факториал из отрицательного числа?");
            return null;
        }
        int result = 1;
        if (n == 0) {
            return result;
        }
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static Integer fact(int n){
        int result = 1;
        if(n == 0 || n ==1){
            return result;
        }
        result = n * fact(n-1);
        return result;
    }
}
