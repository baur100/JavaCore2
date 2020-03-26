import java.sql.Array;

public class HW7 {
    public static void main(String[] args) {
        int[] intArr1 = {2, 3, 5, 6, 7, 8};
        int[] intArr2 = {3, 9, 1, 8, 4, 8, 5};

        System.out.println("Sum = " + sumArr(intArr1));
        sortArr(intArr2);
        int[] intArr3 = {3, 9, 1, 8, 4, 8, 5};
        System.out.println("Max = " + maxArr(intArr3));
    }

    public static int sumArr(int[] intArr1) {
        int x = 0;
        for (int i = 0; i <= intArr1.length - 1; i++) {
            x = x + intArr1[i];
        }
        return x;
    }

    public static void sortArr(int[] intArr2) {
        int x = 0;
        int z = 0;
        int[] y = new int[intArr2.length];

        for (int j = intArr2.length - 1; j >= 0; j--) {
            for (int i = 0; i <= intArr2.length - 1; i++) {
                if (intArr2[i] > x) {
                    x = intArr2[i];
                    z = i;
                }
            }
            intArr2[z] = 0;
            z = 0;
            y[j] = x;
            x = 0;
        }
        System.out.println("Sorted");

        for (int v : y) {
            System.out.print(v + ", ");
        }

    }

    public static int maxArr(int[] intArr3) {
        int max = 0;
        for (int x : intArr3) {
            if (x > max) {
                max = x;
            }
           // System.out.println("maximum = " + max +" "+ x);

        }
        return max;
    }
}


