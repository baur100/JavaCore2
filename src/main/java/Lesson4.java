public class Lesson4 {
    public static void main(String[] args) {//arrays for/ foreach

//        for(int i = 0; i <= 10; i = i + 1){ //инициализация цикла от 0 до 10
//            System.out.println(i);
//        }
//
//        for(int i = 10; i >= 0; i = i - 1){ //инициализация цикла от 10 до 0
//            System.out.println(i);
//        }
//
//        for(int i = 10; i <= 20; i = i + 2){ //инициализация цикла от 10 до 20 четные!
//            System.out.println(i);
//        }
//
//        for(int i = 20; i >= 10; i = i - 2){ //инициализация цикла от 20 до 10
//            System.out.println(i);
//        }

        //int[] arr = {1, 4, 6, 8, 1, 3, 5, 1, 5};// array for each 1 to 5 all array
        //for(int i = 0; i < arr.length; i ++){
        //    System.out.println(arr[i]);
        //}

        int[] arr = {1, 4, 6, 8, 1, 3, 5, 1, 5};// array for each 5 to 1 all array
        //for (int i = arr.length - 1; i >=0; i -- ) {
        //   System.out.println(arr[i]);
        //}

        //for (int i = 8; i >= 0; i--) {//проход массива не по порядку
        //    System.out.println(arr[i]);
        //}
        //for (int v : arr) {//проход массива по порядку
        //    System.out.println(v);

        // for (int v : arr) { //вывод только четных чисел в массиве FOREACH!!!
        //    if (v % 2 == 0) {
        //        System.out.println(v);
        //    }

        //   for (int v1 : arr) { //вывод только нечетных чисел в массиве FOREACH!!!
        //       if (v1 % 2 == 1) {
        //           System.out.println(v1);
        //      }
        //    }

        for (int i = 0; i < arr.length; i++) {//найти по индексу
            if (arr[i] == 5) {
                System.out.println(i);
            }

        }
    }
}
