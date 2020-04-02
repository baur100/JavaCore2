package HW11_Person;

public class Person {
    private Name name;
    private Birthday birthday;
    private Address address;
    private boolean isMarried;
    private Spouse spouse;
    private Job job;
    private Vehicle vehicle;

    public Person(Name name, Birthday birthday, Address address, boolean isMarried, Spouse spouse, Job job, Vehicle vehicle) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.isMarried = isMarried;
        this.spouse = spouse;
        this.job = job;
        this.vehicle = vehicle;
    }

    public void printPerson(){
        name.printPersonName();
        birthday.printBirthday();
        address.printAddress();
        if(isMarried){
            spouse.printSpouseName();
        }else{
            System.out.println("Marital status: Single");
        }
        job.printJob();

        vehicle.printCar();
    }
}
