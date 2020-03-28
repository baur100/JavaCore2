package hw7;

public class Work {
    public static void main(String[] args) {
//        int result = sum(2, 3, 5, 6, 7, 8);
//        System.out.println(result);
        int[] arr1={1,4};
        System.out.println(sum(arr1));


            }

//    public static int sum(int a, int b, int c, int d, int e, int f) {
//        int x = a + b + c + d + e + f;
//        return x;
    }
    public static int sum(int[] arr) {
        int sum = 0;
        for (int v:arr) {
            sum = sum + v;
        }
        return sum;
    }

        }

