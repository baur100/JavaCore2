public class DTworking {
    public static void main(String[] args) {
      int res=min(1,2,3,4,5,6);
        System.out.println(res);

    }

    public static int min(int a, int b, int c, int d, int e, int f) {
        int[] arr = new int[]{a, b, c, d, e, f};
        int min =arr[0];
         for(int v:arr){
        if (v < min) {
            min = v;
        }
    }
     return min;
    }


}
