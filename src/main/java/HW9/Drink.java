package HW9;

public class Drink {
    public String name;
    public String classification;
    public double volume;
    public double price;
    public Boolean isNotAloud;


    public void printInfo(){
        System.out.println("Name: "+name+ "\nClassification: "+classification+ "\nSize: "+volume+"oz"+"\nPrice: "+price+" USD");

//        if(isNotAloud==true){
//            System.out.println("!!!Check customer age!!!");
//        }else {
//            System.out.println("Enjoy your drink!");
//
//        }
        if(classification=="Non-alcoholic"){
            System.out.println("Any age is alowed!");
        }else{
            System.out.println("!!!Check customer ID!!!");
        }

    }
}
