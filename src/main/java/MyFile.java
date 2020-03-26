public class MyFile {
    public static void main(String[] args) {
        System.out.println("Hello, Github");
        int res = mult3(3, 3, 5);
        System.out.println(res);
        int price = 260;
        int age1 = 32;
        int age2 = 30;
        int age3 = 68;
        int age4 = 5;
        double age5 = 1.8;
        System.out.println("pers1 = " + ticketPrice(age1, price));
        System.out.println("pers2 = " + ticketPrice(age2, price));
        System.out.println("pers3 = " + ticketPrice(age3, price));
        System.out.println("pers4 = " + ticketPrice(age4, price));
        System.out.println("pers5 = " + ticketPrice(age5, price));
    }
    public static double ticketPrice(double age, double price) {
        double ticketPrice = price;
        if (age < 2) {
            ticketPrice = 0;
        }
        if (age >= 2 && age <= 12) {
            ticketPrice = price * 0.5;
        }
        if (age > 12 && age < 66) {
            ticketPrice = price;
        }
        if (age >= 66) {
            ticketPrice = price * 0.8;
        }
        return ticketPrice;
    }
    public static int mult3(int a, int b, int c) {
        int x = a * b * c;
        return x;
    }
}