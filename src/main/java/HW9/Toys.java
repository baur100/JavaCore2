package HW9;

public class Toys {
    public String name;
    public double price;
    public int count;


    public void totalPrice (double orderPrice, double delivery) {
        System.out.println("Toy's name - " + name + "." + " Amount: " + count+ "\nBase rate for delivery = $5.0/toy.\n" +
                "You get free delivery for 2 and more toys(if total price is more than $30.0).\n"
                + "Order price is " + orderPrice + " and your delivery is " + delivery + " and \n"
                + "Total price is $ " + (orderPrice + delivery));
    }
    public double orderPrice () {
        double orderPrice = count * price;
        return orderPrice;
    }
    public  double deliveryPrice () {
        double orderPrice = orderPrice();
        int deliveryPrice = 5;
        if (orderPrice > 30) {
            deliveryPrice =0;
            }
        return  deliveryPrice;
    }
}




