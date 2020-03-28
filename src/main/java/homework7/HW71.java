package homework7;

public class HW71 {
//
    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i=0 ; i < arr.length ; i++){
            sum += arr[i];
        }
        return sum;
    }
//    сумма как показал Боуржан
    public static int sumF (int[] arr){
        int sum1=0;
        for (int v: arr) {
            sum1=sum1+v;
        }
        return sum1;
    }
//    умножение
    public static int sumz (int[] arr){
        int mult=1;
        for (int v: arr) {
            mult=mult*v;

        }
        return mult;
    }

}
