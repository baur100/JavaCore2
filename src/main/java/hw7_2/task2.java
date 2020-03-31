package hw7_2;

public class task2 {
    public static void sort(int[] list2) {
        int result = 0;
        int abc;
        for (int i = 1; i < list2.length; i++) {
            for (int c = i; c > 0; c--) {
                if (list2[c] < list2[c - 1]) {
                    abc = list2[c];
                    list2[c] = list2[c - 1];
                    list2[c - 1] = abc;
                }
            }
        }
        for (int i = 0; i < list2.length; i++) {
            System.out.println(list2[i]);
        }
    }
}
