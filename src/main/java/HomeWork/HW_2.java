package HomeWork;

public class HW_2 {
    public static void main(String[] args) {
        int a=100;
        int x=12;
        int d=12;
        int c=122;

        boolean zz1 = a==d;
        System.out.println(zz1);
        boolean zz2 = x==d;
        System.out.println(zz2);
        boolean zz3 = c>=a;
        System.out.println(zz3);
        boolean zz4 = x>=d;
        System.out.println(zz4);
        boolean zz5 = (d==c) || (x==d);
        System.out.println(zz5);
        boolean zz6 = (c>x) && (d>=x);
        System.out.println(zz6);
        boolean zz7 = (a>x) || (a>c);
        System.out.println(zz7);
        boolean zz8 = (a==c) && (d==c);
        System.out.println(zz8);
        boolean zz9 = (c==c) && (a>=a);
        System.out.println(zz9);
        boolean zz0 = (c>c) ||(a<=a);
        System.out.println(zz0);
        boolean zz10 = (x>a) && (c==d);
        System.out.println(zz10);
        boolean zz11 = (c>a) && (x>d);
        System.out.println(zz11);

        int age = 5;
        if(age>=5){
            System.out.println("too young for Kindergarden");
        }else{
            System.out.println("welcome to Kindergarden");
        }

        int price = 100;

        if (price>100) {
            System.out.println("Its too expensive");
        }else{
            System.out.println("You can afford it");

            }
        }


    }

