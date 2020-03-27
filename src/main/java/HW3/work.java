package HW3;

public class work {

    public static void main(String[] args) {

        int[] arrExampleInt = {2,76,9,90,31,76,2,76,21,12};

        for (int i = 0; i <= arrExampleInt.length-1; i++) {
            System.out.print(" " + arrExampleInt[i]);
        }
        System.out.println("");
        String[] arrExampleStr = new String[5];
        arrExampleStr[0] = "Hello";
        arrExampleStr[1] = "World";
        arrExampleStr[2] = "TestPro";
        arrExampleStr[3] = "Just String";
        arrExampleStr[4] = "Another Just String";

        for (int j = 0; j <= arrExampleStr.length-1; j++) {
            System.out.println(" " + arrExampleStr[j]);
        }
        boolean[] arrExamplesBln = new boolean[4];
        arrExamplesBln[0] = false;
        arrExamplesBln[1] = true;
        arrExamplesBln[2] = false;
        arrExamplesBln[3] = true;


    }

}
