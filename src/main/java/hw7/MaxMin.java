//import java.util.Arrays;
//package hw7;
//
//public class MaxMin {
//    public static void main(String[] args) {
//        int[] nums = {3, 9, 1, 8, 4, 8, 5};
//        Arrays.sort(nums);
//        System.out.println("Minimum Value = " + getMinNumber(nums));
//        //Find maximum (largest) value in array using loop
//        System.out.println("Maximum Value = " + getMaxNumber(nums));
//
//
//    }
//
//    public static int getMaxNumber(int[] numbers) {
//        int maxValue = numbers[0];
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] > maxValue) {
//                maxValue = numbers[i];
//               return maxValue;
//        }
//    }
//
//}
//        public static int getMinNumber ( int[] numbers){
//            int minValue = numbers[0];
//            for (int i = 1; i < numbers.length; i++) {
//                if (numbers[i] < minValue) {
//                    minValue = numbers[i];
//                }
//                return minValue;
//            }
//        }
//    }