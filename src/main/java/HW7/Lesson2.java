package HW7;

import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {
        int[] arr1 = {3, 9, 1, 8, 4, 8, 5};
        System.out.println();
        sort(arr1);

    }

    public static void sort(int[] arr) {
        Arrays.sort(arr);
        for (int v : arr) {
            System.out.print(v + " ");

        }
    }
}