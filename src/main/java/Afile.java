public class Afile {
    public static void main(String[]args){
        int price=260;

        int age1=32;
        int age2=30;
        int age3=68;
        int age4=5;
        double age5=1.8;
        System.out.println("pers1="+tPrice(age1, price));
        System.out.println("pers2="+tPrice(age2, price));
        System.out.println("pers3="+tPrice(age3, price));
        System.out.println("pers4="+tPrice(age4, price));
        System.out.println("pers5="+tPrice(age5, price));
    }
    static double tPrice(double age, double price) {
        double tPrice = price;
        if (age < 2) {
            tPrice = 0;
        }
        if (age >= 2 && age <= 12) {
            tPrice = price * 0.5;
        }
        if (age > 12 && age < 66) {
            tPrice = price;
        }
        if (age >= 66) {
            tPrice = price * 0.8;
        }
        return tPrice;
    }
}

