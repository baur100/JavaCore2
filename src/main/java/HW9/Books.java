package HW9;

public class Books {
        public String name;
        public double price;
        public int count;

    public void totalPrice (double ordPrice, double delPrice) {
        System.out.println("Book name: " + name + ". " + "Amount: " + count +
                "\nBase rate for delivery = $0.99/book.\n" +
                "You get free delivery if order price is more than $20.0.\n"+
                "Order price is "  + ordPrice +  ", your delivery is " + delPrice + " and \n"
                + "Total price is $ " + (ordPrice + delPrice));
    }
    public double ordPrice () {
        double xx = count * price;
        return xx;
    }
    public double delPrice () {
        double ordPrice = ordPrice();
        double delPrice = 0.99;
        if (ordPrice > 20) {
            delPrice =0;
        }
        return  delPrice;
    }
}
