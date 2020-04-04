package Types;

import java.util.Date;
import java.util.Random;

public class App {

    public static void main(String[] args) {
        String str = " I'm a string";
        int a = 5;
        System.out.println(a);
        Plane p = new Plane();
        p.name="Boing";

        System.out.println(p.getInfo());

        int[] arr = {1,1,3};

        for (int v:arr) {
            System.out.println(v);
        }
        System.out.println(p);

        Date xx = new Date();
        Random random = new Random();

        System.out.println(xx);



    }
}
