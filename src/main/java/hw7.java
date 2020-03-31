import java.util.Arrays;
import java.util.Collections;

public class hw7 {
    public static void main(String[] args) {
        int[] arr1 = {1,4,9,9};
        System.out.println(sum(arr1));

        int[] arr2 = {55,63,11,11,21,231,234,121,456,789,0,3546,345,33232};
        System.out.println(sum(arr2));

        int[] arr3 = {0};
        System.out.println(sum(arr3));

        sort(arr1);
        sort(arr2);
        sort(arr3);

        System.out.println();
        System.out.println("min = "+ min_max(arr1)[0] + ", max = "+ min_max(arr1)[1]);
        System.out.println("min = "+ min_max(arr2)[0] + ", max = "+ min_max(arr2)[1]);
        System.out.println("min = "+ min_max(arr3)[0] + ", max = "+ min_max(arr3)[1]);
    }

    public static int[] min_max(int[]arr){
        int min = arr[0];
        int max = arr[0];

        for (int v:arr){
            if(v>max){
                max=v;
            }
            if(v<min){
                min=v;
            }
        }
        int[] result = {min,max};
        return result;
    }
    public static void sort(int[] arr){
        System.out.println();
        Arrays.sort(arr);
        for (int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
//        for (int v:arr){
//            System.out.print(v+" ");
//        }
    }
    public static int sum(int[] arr){
        int sum = 0;
        for(int v:arr){
            sum=sum+v;
        }
        return sum;
    }
    
}
