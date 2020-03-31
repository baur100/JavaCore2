package hw7_2;

import static hw7_2.task1.sum;
import static hw7_2.task2.sort;
import static hw7_2.task3.minimax;

public class work {
    public static void main(String[] args) {
        System.out.println("hello there");
        int[] list1 = {2, 3, 5, 6, 7, 8};
        int[] list2 = {3, 9, 1, 8, 4, 8, 5};
        int[] list3 = {3, 9, 1, 8, 4, 8, 5};
        System.out.println("First task - result is " + sum(list1));
        System.out.println("Second task - result is " );
        sort(list2);
        int [] res = minimax(list3);
        System.out.println("Third task - max result is " + res [0]+ " and min result is " +res[1]);

    }
}