import java.util.Arrays;
import java.util.Collections;

public class hw7 {
    public static void main(String[] args) {
        int[] res1={2,4,5,6,8};
        System.out.println(sum(res1));
        System.out.println();
        int[]res2={2,3,4,5,6,7,8,9};
        System.out.println(sum(res2));
        System.out.println();

        }



    public static int sum(int[]arr){
        int sum=0;
        for(int v:arr){
            sum=sum+v;
        }
        return sum;
    }

}
