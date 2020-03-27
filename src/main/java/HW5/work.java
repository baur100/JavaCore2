package HW5;

public class work {
    public static void main(String[] args) {

    //1
        System.out.println("1._______");
        sum1(3,5);
    //2
        System.out.println("2._______");
        int res = sum2(2,9);
        System.out.println("x + y = " + res);

    //3
        System.out.println("3._______");
        boolean res1 = isOdd(32);
        System.out.println("is " + res1);


    }

    public static void sum1(int x, int y){
        System.out.println("x + y = " + (x+y));
    }

    public static int sum2(int x, int y){
        return x+y;
    }

    public static boolean isOdd(int x){
        return (x %2 ==0) ? true:false;

    }
}
