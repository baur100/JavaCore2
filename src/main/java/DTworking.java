import java.util.Arrays;

public class DTworking {
    public static void main(String[] args) {
      int []arr1={1,5,6,7,8,9,4};
        System.out.println(sum(arr1));
       sort (arr1);

    }
    public static int sum(int[]arr){
        int sum =0;
        for(int v:arr){
            sum=sum+v;
        }
        return sum;
    }
    public static void sort(int[]arr){
        Arrays.sort(arr);
        for(int v:arr){
            System.out.print(v+" ");

        }


    }
    public static int min_max(int[]arr) {
        int min = arr[0];
        int max = arr[0];
        for (int v : arr) {
            if (v > max) {
                max = v;
            }
            if (v < min) {
                min = v;
            }
        }
        int[] result = {min, max};
        return result;       }








}
