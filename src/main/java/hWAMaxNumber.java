public class hWAMaxNumber {
    public static void main(String[] args) {
        int[] numbers=new int[]{23,1,5,56,567,78,98,6,900};
        printMaxNumber(numbers);
    }
    public static void printMaxNumber(int[] numbers){
        int max = numbers[0];
        for(int i=1;i<numbers.length;i++) {

            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
            System.out.println(max);
        }
    }



