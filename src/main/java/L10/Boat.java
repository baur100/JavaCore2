package L10;

public class Boat {
    public int length;
    public String name;
    public String owner;
    public int regNumber;

    public Boat(int length, String name, String owner){
        this.length=length;
        this.name=name;
        this.owner=owner;
    }
    public Boat(int length){
        this.length=length;
    }

    public Boat(int l, String o){
        length=l;
        owner=o;
    }
    public Boat(String owner){
        this.owner=owner;
    }
    public void printName(){
        if(name == null){
            System.out.println("no name defined");
            return;
        }
        System.out.println(name);
    }
}
