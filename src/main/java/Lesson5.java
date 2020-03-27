public class Lesson5 {
    public static void main(String[] args) {
        double r1 = 32.4;
        double r2 = 50.0;
        double v1 = CircleSquare(r1);
        double v2 = CircleSquare(r2);

        System.out.println(v1);
        System.out.println(v2);
    }

    public static double CircleSquare(double radius) {
        double square = 3.14 * radius * radius;
        return square;


    }
}
