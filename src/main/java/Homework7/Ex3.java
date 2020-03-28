package Homework7;

public class Ex3 {
    public static void main(String[]args){
     int []arr={3,9,1,8 ,4, 8,5};
        System.out.println("min="+min_max(arr)[0]+ ", max = " + min_max (arr)[1]);


    }
    public static int[] min_max (int []arr){
            int min = arr [0];
            int max = arr [0];
            for (int v:arr){
                if (v>max){
                    max=v;
                }
                if (v < min) {
                    min=v;
                }
            }
            int [] result = {min, max};
            return result;
    }
}
