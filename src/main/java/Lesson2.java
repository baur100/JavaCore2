public class Lesson2 {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = -b;
        int d = b;

        // boolean vv = a == b;
        // boolean vv1 = !vv; //inversion
        // System.out.println(vv1);
        // System.out.println(c);

        //&& - and логическое умножения
        // tкue && true = true    1 * 1 = 1
        // true && false = false  1 * 0 = 0
        // false && true = false  0 * 1 = 0
        //false && false = false  0 * 0 = 0

        // boolean tr1 = a > c && b == d;
        // System.out.println(tr1);
        //boolean tr2 = a == c && b == d;
        //System.out.println(tr2);
        //boolean tr3 = a > c && b != d;
        //System.out.println(tr3);

        // || - or логическое сложение
        // tкue || true = true    1 + 1 = 1
        // true || false = true  1 + 0 = 1
        // false || true = true  0 + 1 = 1
        //false && false = false  0 + 0 = 0

        boolean tr1 = a > b || b > c;
        System.out.println(tr1);
        boolean tr2 = a > c || b >= d;
        System.out.println(tr2);
        boolean tr3 = a > b || c > d;
        System.out.println(tr3);

        int age = 22;
        if (age >= 21) {//логический оператор  if
            System.out.println("here my beer");
        } else {
            System.out.println("no booze");
        }
    }
}
