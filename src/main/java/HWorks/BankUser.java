package HWorks;
public class BankUser {
    private String name;
    private String lastName;
    private int numbersOfAccounts;
    private double debitAvailable;
    private double creditLimit;
    private Address address;
    private int salary;
    private int creditScore;

    public  BankUser(String name, String lastName, Address address ,int numbersOfAccounts,
                     double debitAvailable, double creditLimit){
        this.name = name;
        this.lastName =lastName;
        this.numbersOfAccounts = numbersOfAccounts;
        this.debitAvailable = debitAvailable;
        this.creditLimit = creditLimit;
        this.address=address;
    }
    public BankUser() {
    }
    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
    public void setDebitAvailable(double debitAvailable) {
        this.debitAvailable = debitAvailable;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getCreditScore() {
        return creditScore;
    }
    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumbersOfAccounts(int numbersOfAccounts) {
        this.numbersOfAccounts = numbersOfAccounts;
    }
    public double getCreditLimit() {
        return creditLimit;
    }
    public double getDebitAvailable() {
        return debitAvailable;
    }
    public int getNumbersOfAccounts() {
        return numbersOfAccounts;
    }
    public String getLastName() {
        return lastName;
    }
    public String getName() {
        return name;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public Address getAddress() {
        return address;
    }
    public void printBasicInfo(){
        System.out.println(name+" "+lastName+"\nTotal number of accounts: "+
                numbersOfAccounts+"\nFunds available for today: "+
                debitAvailable+"\nCredit limit on accounts: "+creditLimit+
                "\n"+"Credit score "+creditScore+"\n"+"Salary: "+salary);
    }
    public void printName(){
        System.out.println(name+" "+lastName);
    }
}
