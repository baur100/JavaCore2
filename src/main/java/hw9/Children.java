package hw9;

public class Children {
    public String name;
    public String lastName;
    public String sex;
    public int age;

    public void printInfo(){
        System.out.println("Name: "+name+ "\nLast Name: "+lastName+ "\nSex: "+sex+"\nAge: "+age );
    }
    public void sick(){
        System.out.println("Name: "+name+"\nLast Name: "+lastName);
    }
}
