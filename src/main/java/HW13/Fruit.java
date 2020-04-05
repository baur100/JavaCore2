package HW13;

public class Fruit extends Edible {
    public Fruit(String name, String category) {
        super(name, category);
    }

   public void bloom(){
       System.out.println("This "+name+" is very tasty.");
   }
}
