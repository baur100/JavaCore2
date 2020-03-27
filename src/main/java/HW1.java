public class HW1 {
    public static void main(String[] args) {
        int[] list = new int[]{2, 3, 4, 5, 6, 7, 8};
        System.out.print(sum(list));
    }

    private static int sum(int[] list) {
        int summa = 0;
        for (int x : list) {
            summa = summa + x;
        }
        return summa;
    }


}


