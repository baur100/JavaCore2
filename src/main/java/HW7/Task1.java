package HW7;

public class Task1 {
    public static void main(String[]args){

        // Создайте метод sum - который в качестве аргумента берет int[] и возвращает его сумму.
        //вызовите этот метод из функции main() - подайте в качестве параматра {2,3,5,6,7,8}
       int[] arr1 = {2,3,5,6,7,8};
        System.out.println(sum(arr1));


    }
    public static int sum(int[] array){
        int sum = 0;
        for( int i: array){
            sum = sum+i;
        }

        return sum;
    }
}
