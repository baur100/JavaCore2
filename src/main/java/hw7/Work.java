package hw7;

import java.util.Arrays;
import java.util.stream.IntStream;

import static hw7.HW71.sumOfArray;

public class Work {
    public static void main(String[] args) {
        System.out.println("Exercise 1 ");
        int[] arr1 = {2, 3, 5, 6, 7, 8};
        System.out.println("Array numbers #1 is " + Arrays.toString(arr1));
        System.out.println("Sum numbers of Array #1 is " + sumOfArray(arr1));

        int[] a = {10,20,30,40,50};
        int sum = IntStream.of(a).sum();
        System.out.println("The sum is " + sum);

        int[] numbers = {1,2,3,4,6,6,7};
        int sum1 = 0;
        for( int i : numbers) {
            sum1+= i;
        }
        System.out.println(sum1);

        System.out.println("Exercise 2 ");

        }




    }


