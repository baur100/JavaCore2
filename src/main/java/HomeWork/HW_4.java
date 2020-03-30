package HomeWork;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class HW_4 {
    public static void main(String[] args) {

        int[] arrays = {2, 76, 9, 90, 31, 76, 6, 88, 21, 12};

        for (int v : arrays){
            System.out.println(v);
        }
        System.out.println();
        for (int v : arrays){
            if (v%2==0)
            System.out.println(v);
        }
        System.out.println();
        for(int v :arrays){
            if (v%3==0)
                System.out.println(v);
        }
        System.out.println();

        int max = arrays[0];
        int min = arrays[0];
        for (int v : arrays){
            if(v>max){
                max = v;
            }
            if (v<min);
        }
        System.out.println(max);
        System.out.println(min);

        System.out.println();
        for (int v : arrays){
            if( v%2==1);
            System.out.println(v);
        }
        System.out.println();

        int [] arr = {10,15,12,7,88,10,6,17,23,10,10,16};

        for (int i = 0; i<arr.length; i++){
            if(arr [i] == 10){
                System.out.println(i);

            }
        }
    }
}


