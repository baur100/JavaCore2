package hw7;

import java.util.Arrays;

import static hw7.HomeworkFirst.sumOfArray;
import static hw7.HomeworkSecond.sortArray;
import static hw7.HomeworkThird.minMax;

public class Work {
    public static void main(String[] args) {
        HomeworkFirst first = new HomeworkFirst();
        HomeworkSecond second = new HomeworkSecond();
        HomeworkThird third = new HomeworkThird();

        System.out.println("Homework #7");
        System.out.println();
        // #1
        int[] arr1 = {2, 3, 5, 6, 7, 8};
        System.out.println("Your array in exercise #1 is " + Arrays.toString(arr1));
        System.out.println("Sum of array in exercise #1 is " + sumOfArray(arr1));
        System.out.println();
        // #2
        int[] arr2 = {3, 9, 1, 8, 4, 8, 5};
        System.out.println("Your array in exercise #2 is " + Arrays.toString(arr2));
        System.out.println("And your array sorting in ascending " + Arrays.toString(sortArray(arr2)));
        System.out.println();
        // #3
        int[] arr3 = {3, 9, 1, 8, 4, 8, 5};
        int[] result = minMax(arr3);
        System.out.println("Your array in exercise #3 is " + Arrays.toString(arr3));
        System.out.println("Min in your array is " + result[1] + " and max is " + result[0]);
    }
}
