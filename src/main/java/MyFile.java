public class MyFile {
    public static void main(String[] args) {
        int [] arr1 = {1,4};
        System.out.println(sum(arr1));
    }
    public static int sum (int []arr){
        int sum=0;
        for (int v:arr){
            sum=sum + v;
        }
        return sum;
    }
}
