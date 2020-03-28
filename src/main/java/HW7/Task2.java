package HW7;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

// 2. Создайте метод sort - который в качестве аргумента берет int[] и выводит на экран сортированную последовательность по возрастанию.
//вызовите этот метод внутри функии main()
//подайте в качестве параметра {3,9,1,8,4,8,5}

        int[] array1 = {3, 9, 1, 8, 4, 8, 5};

        bubbleSort(array1);

        sort(array1);



    }
    public static void bubbleSort(int[]arr){
        for(int i=0; i<arr.length;i++){
            int rightNumber = arr[i];

            for(int j=i-1; j>=0; j--){
                int leftNumber = arr[j];
                if(rightNumber<leftNumber){
                    arr[j+1]=leftNumber;
                    arr[j] = rightNumber;
                } else{
                    break;
                }
            }
        }
        for(int v:arr){
            System.out.print(v+ " ");
        }
    }

    public static void sort(int[]arr){
        System.out.println();
        Arrays.sort(arr);
        for(int v:arr){
            System.out.print(v+ " ");
        }
    }



}









