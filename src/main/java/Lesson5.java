public class Lesson5 {
    public static void main(String[] args) {
//        double r1 = 32.4;
//        double r2 = 50.0;
//        double v1 = CircleSquare(r1);
//        double v2 = CircleSquare(r2);
//        System.out.println(v1);
//        System.out.println(v2);

        System.out.println("55 ?" + isEven(56));

        int result1 = sum5(1, 2, 3, 4, 5);
        System.out.println(result1);

    }

    public static double CircleSquare(double radius) {
        double square = 3.14 * radius * radius;
        return square;

    }

    public static int sum5(int a, int b, int c, int d, int e) {
        int sum = a + b + c + d + e;
        return sum;
    }

   // public static boolean isEven(int a) {
//    if (a % 2 == 0) {
//        return true;
//    } else {
//        return false;
//    }
        public static boolean isEven(int a) {//at this same only short!!
            return a%2==0;
        }

    }
