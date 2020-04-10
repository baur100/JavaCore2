package hWA8;

public class Cat {
    public String name;
    public String bride;
    public int age;
    public String country;

    public void printInfo(){
        System.out.print("Cat with name: "+name+"\nfrom country: "+country+"\n\tbride: "+bride+"\n\tage: "+age);
        System.out.println("");
    }
    public void catSlip(){System.out.println("Cat with name "+name+" is sliping");}
    public void catSong(){System.out.println("Cat " +name+" say "+ " Miau=Miau");}
    public void catMoving(){System.out.println("Cat "+name+" is jumping");}
}
