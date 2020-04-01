package HW7;

public class Lesson1 {

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 5, 6, 7, 8};
        System.out.println(sum(arr1));
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sum(arr2));
    }

    public static int sum(int[] arr) {
        int sum = 0;//инициализация нулем !!!
        for (int v : arr) {
            sum = sum + v;
            // sum = 0 + 1
        }
        return sum;
    }
}
