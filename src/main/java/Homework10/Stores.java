package Homework10;

public class Stores {
    public String name;
    public String producequality;
    public Double averagecheck;

    public Stores(String name1, String producequality1, Double averagecheck1) {
        name = name1;
        producequality = producequality1;
        averagecheck = averagecheck1;

    }
    public Stores(){}

    public Stores(String S){
        name=S;
    }

    public void printStores(){
        System.out.println(name + " sells " + producequality + " produce.");
    }
}


