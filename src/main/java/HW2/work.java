package HW2;

public class work {
    public static void main(String[] args) {

        int b=3;
        int y=7;

        if (b <= 3) {
            System.out.println("Hello, Everyone");
        }
        else {
            y=20;
            System.out.println("Now y = " + y);
        }

        if (y+b == 6) {
            System.out.println("x + y = 6");
        }
        else {
            System.out.println("x + y = " + (b+y) + " sorry");
        }

        if (b == 3 && y == 7) {
            int z = 4 * (b+y);
            System.out.println("z = " + z);
        }


        int a=100;
        int x=12;
        int d=12;
        int c=122;

        boolean[] zz= new boolean[12];

        int[] pp;

        zz[0] = (c>c) || (a<=a);
        zz[1] = a==d;
        zz[2] = x==d;
        zz[3] = c>=a;
        zz[4] = x>=d;
        zz[5] = (d==c) || (x==d);
        zz[6] = (c>x) && (d>=x);
        zz[7] = (a>x) || (a>c);
        zz[8] = (a==c) && (d==c);
        zz[9] = (c==c) && (a>=a);
        zz[10] = (x>a) && (c==d);
        zz[11] = (c>a) && (x>d);

        for (int i = 0; i < zz.length; i++ ) {

            if (zz[i] == false) {
                System.out.println("zz"+i+"  "+ zz[i] + " WTF");
            } else System.out.println("zz"+i+"  "+ zz[i] + " OMG");
        }


    }
}
