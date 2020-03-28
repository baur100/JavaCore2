package Homework7;
import java.util.Arrays;
public class Ex2 {
    public static void main(String[] args) {
        int[] array = {3, 9, 1, 8, 4, 8, 5};
        sort (array);
    }
    public static void sort(int[] array) {
        System.out.println( );
        Arrays.sort(array);
        for (int i=array.length-1; i>=0; i--)
//        for (int v:array){
            System.out.print(array[i]+" ");
//        System.out.println(v+" ");
        }
//        int []sorted= new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            int min = array[i];
//            int minId = i;
//            for (int x = i + 1; x < array.length; x++) {
//                if (array[x] < min) {
//                    min = array[x];
//                    minId = x;
                }


