package Lesson10;

public class House {

    public int sq;
    public int bedroom;
    public int bathrooms;
    public String type;

    public House(int sq, int bedroom, int bathrooms, String type) {
        this.sq = sq;
        this.bedroom = bedroom;
        this.bathrooms = bathrooms;
        this.type = type;
    }

    public House(){}
    public void printHouseInfo() {
        System.out.println(sq + " ");


    }
}


