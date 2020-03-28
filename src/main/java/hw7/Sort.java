package hw7;

public class Sort {
    public static void main(String[] args) {

        int[] array = {3, 9, 1, 8, 4, 8, 5};
        int sort;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    sort = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = sort;

                }


        }
    }
    for (int i = 0; i < array.length; i++) {
        System.out.println(array[i]);
}
        }
        }

