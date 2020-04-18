public class hWAOddNumbers {
    public static void main(String[] args) {
        int[] list = new int[]{7, 8, 9, 56, 34, 22, 32, 45, 56, 65};
        printOddNumbers(list);
    }

    private static void printOddNumbers(int[] list) {
        for(int x:list){
            if(x%2==0){
                System.out.println(x);
            }
        }
    }
}
