package HW9;

public class App {
    public static void main(String[] args) {

        // Toys
        System.out.println();
        Toys toy1 = new Toys();
        toy1.name = "Car";
        toy1.count = 1;
        toy1.price = 10.50;
        double orderPrice1 = toy1.orderPrice();
        double deliveryPrice1 = toy1.deliveryPrice();
        toy1.totalPrice(orderPrice1, deliveryPrice1);

        System.out.println();
        Toys toy2 = new Toys();
        toy2.name = "Barby Doll";
        toy2.count = 2;
        toy2.price = 35.99;
        double orderPrice2 = toy2.orderPrice();
        double deliveryPrice2 = toy2.deliveryPrice();
        toy2.totalPrice(orderPrice2, deliveryPrice2);

        System.out.println();
        Toys toy3 = new Toys();
        toy3.name = "Teddy Bear";
        toy3.count = 4;
        toy3.price = 7.99;
        double orderPrice3 = toy3.orderPrice();
        double deliveryPrice3 = toy3.deliveryPrice();
        toy3.totalPrice(orderPrice3, deliveryPrice3);

        //  Books
        System.out.println();
        Books Book1 = new Books();
        Book1.name = "Harry Potter";
        Book1.count = 2;
        Book1.price = 33.99;
        double ordPrice1 = Book1.ordPrice();
        double delPrice1 = Book1.delPrice();
        Book1.totalPrice(ordPrice1, delPrice1);


        System.out.println();
        Books Book2 = new Books();
        Book2.name = "Dark Time";
        Book2.count = 1;
        Book2.price = 12.99;
        double ordPrice2 = Book2.ordPrice();
        double delPrice2 = Book2.delPrice();
        Book2.totalPrice(ordPrice2, delPrice2);


        //   Medical_Patient
        System.out.println();
        Medical_Patient patient1 = new Medical_Patient();
        patient1.name = "Ann";
        patient1.last_name = "White";
        patient1.age = 78;
        patient1.e_mail = "a.white@gmail.com";
        patient1.address = "5 Ive Dr Apt 2201, Arlington, NC, 45678";
        patient1.phone_number = "123456789";
        patient1.main_disеаsе = "Diabet Type II";

        System.out.println();
        Medical_Patient patient2 = new Medical_Patient();
        patient2.name = "Alex";
        patient2.last_name = "Rogers";
        patient2.age = 26;
        patient2.e_mail = "alex.rog@yahoo.com";
        patient2.address = "2015 Oak Street, Cerolton, SC, 78901";
        patient2.phone_number = "3456889900";
        patient2.main_disеаsе = "Pain Back";


        patient1.printInfo();
        System.out.println();
        patient2.printInfo();


        // Chemicals
        System.out.println();
        Chemicals chemical1 = new Chemicals();
        chemical1.name = "Sodium_Hydroxide";
        chemical1.category ="Solid";
        chemical1.hazard_level = 1;
        chemical1.supplier = "Merck";
        chemical1.supplier_e_mail = "merck_info@gmail.ua";
        chemical1.supplier_phone_number = "2233445566";
        chemical1.supplier_contact_person = "Marta";
        chemical1.transportation = "Regular";
        chemical1.storage = 3;


        System.out.println();
        Chemicals chemical2 = new Chemicals();
        chemical2.name = "Sulfuric acid";
        chemical2.category ="Liquid";
        chemical2.hazard_level = 5;
        chemical2.supplier = "ABC LAB";
        chemical2.supplier_e_mail = "abclab_info@gmail.com";
        chemical2.supplier_phone_number = "5689712050";
        chemical2.supplier_contact_person = "Mr.Ball";
        chemical2.transportation = "Special Type 3";
        chemical2.storage = 4;



        chemical1.printInfo();
        System.out.println();
        chemical2.printInfo();
    }
}









