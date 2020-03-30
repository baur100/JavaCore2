package Homework8;
import org.w3c.dom.ls.LSOutput;

public class Flower {
    public String name;
    public String color;
    public String smell;
    public String availability;

    public void printFlower(){
        System.out.println( name + " is " + color +  " has a " + smell + " smell and is a "+ availability + " flower." );
    }
}

