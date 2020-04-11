package Lesson17;

public class App {
    public static void main(String[] args){

        int[] xx = {2, 54, 2};
        try {
            int vv = xx[5];
            int vvv = 6/0;

            System.out.println("not error");
        } catch (Exception err) {
            System.out.println("error");
            System.out.println("Divide by 0");

        }finally {
            System.out.println("any case");

        }
    }
}
