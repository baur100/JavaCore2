package hw7;
import java.util.Arrays;

public class hw7 {

    public static void main(String[] args) {

        String line = new String(new char[48]).replace('\0','-');
        int[] arr = {2, 3, 5, 6, 7, 8, 10, 156};
        int[] arr2 = {3, 9, 1, 8, 4, 8, 5};
        int[] arr3 = {3, 9, 1, 8, 4, 8, 5};

        // SUM

        System.out.print("\n");
        System.out.println(sum(arr, true));
        System.out.println(line);
        System.out.println("Sum: " + sum(arr, false));

        // SORT

        System.out.println(line);
        arraySort(arr2);
        System.out.print('\n');

        // MIN/MAX

        System.out.println(line);
        System.out.println("Min: " + minMax(arr3)[0]);
        System.out.println(line);
        System.out.println("Max: " + minMax(arr3)[1] );
    }

    // Exercise 1

    public static int sum(int[] arr, boolean method) {
        // Method 1 - WHEN TRUE IS PASSED
        if (method) {
            int sum1 = 0;
            System.out.println("Method 1 - Executed");
            for (int i = 0; i < arr.length; i++)
                if (i == (arr.length - 1)) {
                    sum1 += arr[i];
                    System.out.print(arr[i] + " = ");
                } else {
                    System.out.print(arr[i] + " + ");
                    sum1 += arr[i];
                }
            return sum1;
        }

        // Method 2 - WHEN FALSE IS PASSED
        if (!method) {
            int sum2 = 0;
            System.out.println("Method 2 - Executed");
            for (int value : arr) {
                sum2 += value;
           }
            return sum2;
        }
        return 0;
    }

    // Exercise 2

    public static void arraySort(int[] arr) {
        Arrays.sort(arr, 0, arr.length);
        for (int v : arr) {
            System.out.print(v + " ");
        }
    }

    public static int[] minMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int v:arr){
            if (v > max){
                max = v;
            }
            if (v < min){
                min = v;
            }
        }
        int[] result = {min, max};
        return result;
    }
}
