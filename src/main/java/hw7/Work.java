package hw7;

import java.util.Arrays;

public class Work {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 5, 6, 7, 8};
        System.out.println(sum(arr1));

        sort(arr1);
        System.out.println("min =" + min_max(arr1)[0] + ",max= " + min_max(arr1)[1]);

    }

    public static int[] min_max(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int v : arr) {
            if (v > max) {
                max = v;
            }
            if (v < min) {
                min = v;
            }
        }

        public static void sort ( int[] arr){
            int[] sorted = new int[arr.length];
            Arrays.sort(arr);
            for (int i = arr.length - 1; i > 0; i--) {
                System.out.print(arr[i] + "  ");
            }
//        for (int v : arr) {
//            System.out.print(v + " ");
        }


        public static int sum ( int[] arr){
            int sum = 0;
            for (int v : arr) {
                sum = sum + v;
            }
            return sum;
        }
    }
    

