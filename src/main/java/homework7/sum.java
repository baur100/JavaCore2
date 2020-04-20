package homework7;

public class sum {
    public static void main(String[] args){
        int[] arr1= {1,4,9,9};

        System.out.println(sum(arr1));

        int[] arr2={55, 63, 11,11,21,231,234,121,456,789,0,3546,345,33232};
        System.out.println(sum(arr2));
    }
     public static int sum(int [] arr){
        int sum = 0;
        for(int v: arr){
            sum=sum+v;
            //sum=0+1 (1)
            //sum=1+4 (5)
            //sum=5+9 (14)
            //sum=14+9 (23)
        }

        return sum;

    }
}

