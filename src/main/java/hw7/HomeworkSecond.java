package hw7;

public class HomeworkSecond {
    public static int[] sortArray(int[] nonSortedArray) {
        int[] sortedArray = new int[nonSortedArray.length];
        int temp;
        for (int j = 0; j < nonSortedArray.length - 1; j++) {
            for (int i = 0; i < nonSortedArray.length - 1; i++) {
                if (nonSortedArray[i] > nonSortedArray[i + 1]) {
                    temp = nonSortedArray[i];
                    nonSortedArray[i] = nonSortedArray[i + 1];
                    nonSortedArray[i + 1] = temp;
                    sortedArray = nonSortedArray;

                }
            }
        }
        return sortedArray;
    }
}
