public class hWAFibonacciNumbers {
    public static void main(String[] args) {
        int n=9;
        int n1=0;int n2=1;
        System.out.println("sequence of "+n+" Fibonacci numbers");
        for(int i=1;i<=n;i++){
            System.out.println(n1+" ");
            int sumOfTwo = n1+n2;
            n1=n2;
            n2=sumOfTwo;
        }

    }
}
