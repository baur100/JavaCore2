public class DTworking {
    public static void main(String[] args) {
        int res1 = mult1(1,2,3);
        System.out.println(res1);
        int age1=32;
        int age2=30;
        int age3=68;

        int age4=5;







    }
    public static int mult1(int a, int s, int d){
        int i = a*s*d;
        return i;
    }
    public static double ticketprice(double age, double price){
        double ticketprice = price;
        if(age<2){
            ticketprice=0;
        }
        if(age>=2&&age<12){
            ticketprice= price *0.5;
        }
        if(age>=12&&age<66){
            ticketprice= price;
        }
        if(age<+66) {
            ticketprice = price * 0.8;
        }
        return price;

    }

}
