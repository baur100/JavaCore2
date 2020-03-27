package HW4;

public class work {
    public static void main(String[] args) {
    //0
    int[] arrInt = {2,76,9,90,31,76,6,88,21,12};

    //1a
        System.out.println("------1a");
        for (int x: arrInt) {
            System.out.print(" " + x);
        }

    //1b
        System.out.println("-------1b");
        for (int y: arrInt) {
           if (y%2 == 0) {

               System.out.println(y+" is even");
           }
        }

    //1c
        System.out.println("-------1c");
        for (int z: arrInt) {
            if (z%3 == 0) {

                System.out.println(z+" is divided by 3");
            }
        }
    //1d
        System.out.println("--------1d");
        int maxV=0;
        for (int m : arrInt) {
            if (m > maxV) {
                maxV = m;
            }
        }

        System.out.println(maxV +" is maximum");

    //1e
        System.out.println("-------1e");
        int minV=100;
        for (int n : arrInt) {
            if (n < minV) {
                minV = n;
            }
        }

        System.out.println(minV +" is maximum");

    //1f
        System.out.println("--------1f");
        for (int h: arrInt) {
            if (h%2 != 0) {

                System.out.println(h+" is odd");
            }
        }

    //2
        System.out.println("_________2");
int[] arrInt2 = {10,15,12,7,88,10,6,17,23,10,10,16};

        System.out.println("");
        for (int q=0; q<=arrInt2.length-1; q++) {
            if (arrInt2[q] == 10) {
                System.out.println(q);
            }
        }

    }
}
