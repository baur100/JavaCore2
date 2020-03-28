package homework7;

public class sum {
    public static void main(String[] args){
        int val = calcSum (2,3,5,6, 7, 8);
        System.out.println(val);
    }
    static int calcSum(int a, int b, int c, int d, int e, int f) {
        int sum = a + b + c + d + e + f;
        System.out.println(sum);

        return sum;

    }
}

