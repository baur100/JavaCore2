package HW7;

import java.util.Arrays;

public class HW7 {

    public static void main(String[] args) {


        int[]number = {2,3,5,6,7,8};
        System.out.println(sum(number));


        int[]arr = {3,9,1,8,4,8,5};
        sort(arr);


        int[]minmax = {3,9,1,8,4,8,5};
        System.out.println("min is " + min_max(minmax)[0] + ", max is " + min_max(minmax)[1]);

    }

    public static int sum(int[]number) {
        int sum = 0;
        for (int x:number) {
            sum = sum + x;}
        return sum;
        }

    public static void sort(int[]arr) {
        System.out.println();
        Arrays.sort(arr);
        for (int i=arr.length-1; i>=0; i--) {
            System.out.println(arr[i]+" ");
        }
    }


    public static int[] min_max(int[]minmax) {
        int min = minmax[0];
        int max = minmax[0];

        for (int j : minmax) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }
        int[] result = {min, max};
        return result;
    }
}
