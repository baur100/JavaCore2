package HWorks;

public class Apps {
    public static void main (String[]args) {
        Address adrJose = new Address("123 joplin st","Chicago","IL",12345);
        BankUser jose = new BankUser("fg","sncn",adrJose,9,900.08,56000.00);
        jose.setName("Jose");
        jose.setLastName("Alarick");
        jose.setNumbersOfAccounts(3);
        jose.setCreditLimit(48900.00);
        jose.setDebitAvailable(1);
        jose.setSalary(136000);
        jose.printBasicInfo();

        jose.getAddress().printAddress();




        Creatures dog = new Creatures();
        dog.setAmiability("Friendly to every other alive creatures");
        dog.setDesignation("Dog");
        dog.setHabitat("Overland");
        dog.setAverageColor("From monochromatic of every color, to mix of them");
        dog.setAverageHeight(35.5);
        dog.setAverageLifeLasting(15);
        dog.printCreature();

        Creatures human = new Creatures();
        human.setAverageColor("Black,White");
        human.setDesignation("Human");
        human.setHabitat("Overland");
        human.setAmiability("Some individual is hostile, but average human is friendly to humans and other creatures");
        human.setAverageHeight(155.185);
        human.setAverageLifeLasting(72);
        human.printCreature();
    }
}
