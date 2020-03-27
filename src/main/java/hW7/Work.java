package hW7;

import static hW7.Max.max;
import static hW7.Min.min;
import static hW7.Sort.sort;
import static hW7.Sum.sum;

public class Work {
    public static void main(String[]args){
        Sort sort=new Sort();
        Sum sum = new Sum();

        int[] list = new int[]{2, 3, 4, 5, 6, 7, 8};
        System.out.print(sum(list));
        System.out.println("+++++++++++++++++++++++++++");

        int[] listone = new int []{3,9,1,8,4,8,5};
        int [] listtwo = sort(listone);

        for (int x:listtwo) {
            System.out.print(x+" ");
        }
        System.out.println("___________________");
        System.out.print(min(listone));

        System.out.println("___________________");
        System.out.print(max(listone));



    }
}


