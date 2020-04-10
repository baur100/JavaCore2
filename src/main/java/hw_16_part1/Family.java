package hw_16_part1;

import java.util.HashMap;
import java.util.Map;

public class Family {
    private String name;
    private int age;
    private HashMap<String,Integer> info;

    public Family(HashMap<String, Integer> info) {
        this.info = info;
    }

    public Family(int age) {
        this.age = age;
    }

    public Family(String name, int age) {
    }

    public Family(String name) {
        this.name = name;
    }

    public void printInfo(){
        System.out.println(info);
    }
}
