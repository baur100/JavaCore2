package HW4;

public class HW4 {
    public static void main(String[] args) {

        int[] numbers = {2, 76, 9, 90, 31, 76, 6, 88, 21, 12, 1};

        for (int i : numbers) {
            System.out.println(i);
        }
        for (int j : numbers) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }
        for (int k : numbers) {
            if (k % 3 == 0) {
                System.out.println(k);
            }
        }
        int max = numbers[0];
        for (int l : numbers) {
            if (l > max) {
                max = l;
                System.out.println(max);
            }
        }
        int min = numbers[0]; {
            for (int m : numbers) {
                if (m < min) {
                    min = m;
                    System.out.println(min);
                }
            }
        }
        for (int p : numbers) {
            if (p % 3==1)
                System.out.println(p);
        }
        int[] ten = {10,15,12,7,88,10,6,17,23,10,16};
        int i = 0;
        for (int p : ten) {
            if (p==10) {
                System.out.println(p);
            }
            i++;
        }


    }

}

