public class MyApp {
    public static void main(String[] args) {
        System.out.println("Hello, Github");
        int result = mult3(3,3,5);
        System.out.println(result);

        int price = 220;

        int age1 = 32;
        int age2 = 30;
        int age3 = 68;
        int age4 = 5;
        double age5 = 1.8;

        System.out.println("Person 1 = "+ticketPrice(age1,price));
        System.out.println("Person 2 = "+ticketPrice(age2,price));
        System.out.println("Person 3 = "+ticketPrice(age3,price));
        System.out.println("Person 4 = "+ticketPrice(age4,price));
        System.out.println("Person 5 = "+ticketPrice(age5,price));

    }

    public static double ticketPrice(double age, double price){
        double ticketPrice = price;
        if (age < 2){
            ticketPrice = price * 0;
        }
        if (age >= 2 && age <= 12){
            ticketPrice = price * 0.5;
        }
        if (age >12 && age < 66){
            ticketPrice = price * 1;
        }
        if (age >= 66){
            ticketPrice = price * 0.8;
        }
        return ticketPrice;
    }

    public static int mult3(int a, int b, int c){
        int x = a*b*c;
        return x;
    }
}
