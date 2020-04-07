package hw11_Person;

public class Person {
    private Name name;
    private Birthday birthday;
    private Address address;
    private boolean isMarried;
    private Family family;
    private Job job;
    private Vehicle vehicle;

    public Person(Name name, Birthday birthday, Address address, boolean isMarried, Family family, Job job, Vehicle vehicle) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.isMarried = isMarried;
        this.family = family;
        this.job = job;
        this.vehicle = vehicle;
    }

    public void printPerson(){
        name.printPersonName();
        birthday.printBirthday();
        address.printAddress();
        if(isMarried){
            family.printFamily();
        }else{
            System.out.println("Marital status: Single");
        }
        job.printJob();

        vehicle.printCar();
    }
}
