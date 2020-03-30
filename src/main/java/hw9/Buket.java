package hw9;

public class Buket {
    public String name;
    public int count;
    public double price;

    public void totalPrice(double orderPrice, double delivery) {
        System.out.println("Delivery flat rate is $10.0.\n" +
                "Free delivery for order more $25.\nYour total order is $"
                + orderPrice + " and delivery price is $" + delivery + "." +
                "\nYour total is $" + (orderPrice + delivery) + ".");
    }

    public static double orderPrice(int count, double price) {
        double x = count * price;
        return x;
    }

    public static double deliveryPrice(double orderPrice) {
        int deliveryPrice = 10;
        if (orderPrice > 25) {
            deliveryPrice = 0;
        }
        return deliveryPrice;
    }
}