package MyHomework;

import org.w3c.dom.css.CSSImportRule;

import java.util.Arrays;

public class HW7 {
    public  static void main(String[]args){
        // Создайте метод sum - который в качестве аргумента берет int[] и возвращает его сумму.
        //вызовите этот метод из функции main() - подайте в качестве параматра {2,3,5,6,7,8}

//        2. Создайте метод sort - который в качестве аргумента берет int[] и выводит на экран сортированную последовательность по возрастанию.
//                вызовите этот метод внутри функии main()
//        подайте в качестве параматра {3,9,1,8,4,8,5}
//        3. Создайте метод, который в качестве аргумента берет int[] и возвращает максимальное/минимальное значение
//        (группа мак - макчимальное/ группа win - минимальное)
//        подайте в качестве параматра {3,9,1,8,4,8,5}

        //example 1
        int[] arr1={1,4,9,9};
        System.out.println(sum(arr1));

        //example 2
        int[] arr2 = {55,63,11,11,21,231,234,121,456,789,0,3546,345,33232};
        System.out.println(sum(arr2));

        //example 3
        int[] arr3={0};
        System.out.println(sum (arr3));

        sort(arr1);
        sort(arr2);
        sort (arr3);

        System.out.println();
        System.out.println("min= "+min_max(arr1)[0]+ " , max = "+min_max(arr1)[1] );

    }

    public static int sum(int[] arr){
        int sum = 0;
        for(int v:arr){
            sum=sum+v;
            //example 1 (with arr1)
            //sum=0+1 (1)
            //sum=1+4 (5)
            //sum=5+9 (14)
            //sum=14+9 (23)
        }
        return sum;
    }

    public static void sort(int[]arr){
        System.out.println();
        Arrays.sort(arr);
        for(int v:arr){
            System.out.print(v+" ");
        }
    }

//     3. Создайте метод, который в качестве аргумента берет int[] и возвращает максимальное/минимальное значение
////        (группа мак - макчимальное/ группа win - минимальное)
////        подайте в качестве параматра {3,9,1,8,4,8,5}
    public static int[] min_max(int[]arr){
        int min = arr[0];
        int max=arr[0];

        for(int v:arr){
            if(v>max){
                max=v;
            }
            if(v<min){
                min = v;
            }
        }
        int[] result ={min,max};
        return result;

    }
}
