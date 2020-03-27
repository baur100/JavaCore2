package homework;

public class hw4 {
    public static void main(String[] args) {
//        for (int i = 0; i <= 10; i = i + 1) {
//            System.out.println("hi");
//        }

//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//        for (int i = arr.length - 1; i >= 0; i--) {
//            System.out.println(arr[i]);
//        }
//
//        for (int value : arr) {
//            System.out.println(value);
//        }

//        for(int v:arr){
//            if(v%2 == 0){
//                System.out.println(v);
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0) {
//                System.out.println(i);
//            }
//        }

        int[] arr1 = new int[10];
        int i = 0;
        for (int v: arr1) {
            if (i == 0) {
                arr1[i] = 2;
            } else {
                if (i == 1) {
                    arr1[i] = 76;
                } else {
                    if (i == 2) {
                        arr1[i] = 9;
                    } else {
                        if (i == 3) {
                            arr1[i] = 90;
                        } else {
                            if (i == 4) {
                                arr1[i] = 31;
                            } else {
                                if (i == 5) {
                                    arr1[i] = 76;
                                } else {
                                    if (i == 6) {
                                        arr1[i] = 6;
                                    } else {
                                        if (i == 7) {
                                            arr1[i] = 88;
                                        } else {
                                            if (i == 8) {
                                                arr1[i] = 21;
                                            } else {
                                                arr1[i] = 12;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            i++;
        }
        System.out.println();
        System.out.println("All elements of array");

        for (int v : arr1) {
            System.out.println(v);
        }

        System.out.println();
        System.out.println("Only even numbers:");

        for (int v:arr1){
            if(v%2 == 0){
                System.out.println(v);
            }
        }

        System.out.println();
        System.out.println("Only devided by 3 without change");

        for (int v:arr1){
            if(v%3 == 0){
                System.out.println(v);
            }
        }

        System.out.println();
        System.out.println("Biggest integer in array");

        int max = arr1[0];
        for(int i2=0;i2<arr1.length;i2++){
            if(max<arr1[i2]){
                max = arr1[i2];
            }
        }
        System.out.println(max);

        System.out.println();
        System.out.println("Smallest integer in array");

        int min = arr1[0];
        for(int i2=0;i2<arr1.length;i2++){
            if(min>arr1[i2]){
                min = arr1[i2];
            }
        }
        System.out.println(min);

        System.out.println();
        System.out.println("Only odd numbers:");

        for (int v:arr1){
            if(v%2 == 1){
                System.out.println(v);
            }
        }

        System.out.println();
        System.out.println("Task2. Printing index of value 10");

        int[] arr2 = {10,15,12,7,88,10,6,17,23,10,10,16};
        int i1 = 0;

        for (int v:arr2){
            if(v == 10){
                System.out.println(i);
            }
            i1++;
        }


    }
}
