package HW7;

public class Task3 {
    public static void main(String[]args){
        //     3. Создайте метод, который в качестве аргумента берет int[] и возвращает максимальное/минимальное значение
       ////        (группа max - макcимальное/ группа min - минимальное)
      ////        подайте в качестве параматра {3,9,1,8,4,8,5}
        int [] array1 = {3,9,1,8,4,8,5};

        System.out.println("min = "+min_max(array1)[0] + " max = "+ min_max(array1)[1]);
    }
    public static int[] min_max(int[]arr){
        int min = arr[0];
        int max = arr[0];

        for(int v:arr){
            if(v>max){
                max = v;
            }
            if(v<min){
                min = v;
            }
        }
        int [] result = {min, max};
        return result;
    }


}
