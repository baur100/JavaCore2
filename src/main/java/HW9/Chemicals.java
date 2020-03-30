package HW9;

public class Chemicals {

    public String name;
    public String category;
    public int hazard_level;
    public String supplier;
    public String supplier_e_mail;
    public String supplier_phone_number;
    public String supplier_contact_person;
    public String transportation;
    public int storage;


    public void printInfo() {
        System.out.println("Name: " + name +
                "\nCategory: " + category +
                "\nHazard level: " + hazard_level +
                "\nSupplier name: " + supplier +
                "\nSupplier e-mail: " + supplier_e_mail +
                "\nSupplier phone number: " + supplier_phone_number +
                "\nPhone number: " + supplier_contact_person +
                "\nTransportation: " + transportation +
                "\nStorage: " + storage );

    }
}
