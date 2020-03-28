package Homework7;

public class Ex1 {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 5, 6, 7, 8};
        System.out.println(sum(arr1));
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int v : arr) {
            sum = sum + v;
        }
        return sum;
    }
}


