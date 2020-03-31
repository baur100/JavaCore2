package HomeWork;

public class HW_7 {
    public static void main(String[] args) {

        int [] arr = {2,3,5,6,7,8};
        System.out.println(sum(arr));

    }
    public static int sum (int [] array){
        int sum = 0;
        for (int v : array){
            sum = sum+v;
        }
        return sum;
    }

    public static void sort (){

    }
}

