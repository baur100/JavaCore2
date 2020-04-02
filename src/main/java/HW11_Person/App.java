package HW11_Person;

public class App {
    public static void main(String[] args){
        Name name = new Name("John", "Smith");
        Birthday dob = new Birthday("May", 3, 1975);
        Address add = new Address(111, "Main street", 101, "Los Angeles", "CA", 90001);
        Spouse bobSpouse = new Spouse("Anna", "Smith");
        Job bobJob = new Job("Doctor","Children Hospital", true);
        Vehicle bobCar = new Vehicle("Honda","Accord", 2020, "white");
        Person bob = new Person(name, dob, add, true, bobSpouse, bobJob, bobCar);
        bob.printPerson();


    }
}
