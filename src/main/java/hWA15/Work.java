package hWA15;

import java.util.ArrayList;

public class Work {
    public static void main(String[]args){
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("apple");
        fruits.add("peach");
        fruits.add("pineapple");
        fruits.add("watermelon");
        System.out.println(fruits.size());
        fruits.add(0,"coco");
        System.out.println(fruits.size());
        System.out.println(fruits.get(0));
        fruits.remove("pineapple");
        System.out.println(fruits.size());
        for(String v:fruits){
            System.out.println(v);
        }

        ArrayList<Integer> numbers =new ArrayList<>();
        numbers.add(12);
        numbers.add(14);
        numbers.add(123);
        numbers.add(67);
        System.out.println(numbers.size());
        numbers.forEach(x-> System.out.println(x));
        numbers.add(0,800);
        numbers.forEach(x-> System.out.println(x));
        numbers.remove(0);
        numbers.forEach(v-> System.out.println(v));
        numbers.set(0,0);
        numbers.forEach(c-> System.out.println(c));


        Name name1 = new Name("Ivan", "Chi");
        Address address1 = new Address("123, Edinger str","Irvine 92604, CA");
        Person person1=new Person(name1,address1);

        Name name2 = new Name("Paul", "Zhu");
        Address address2 = new Address("12, Harvard str","Irvine 92604, CA");
        Person person2=new Person(name2,address2);

        Person person3=new Person(name2,address1);

        Person person4=new Person(name1,address2);

        ArrayList<Person> students = new ArrayList<>();
        students.add(person1);
        person1.printInfo();
        students.add(person2);
        System.out.println(students.size());
        students.forEach(c-> System.out.println(c.printInfo()));
        students.set(1,person3);
        System.out.println(students.size());
        students.forEach(c-> System.out.println(c.printInfo()));
        students.remove(0);
        System.out.println(students.size());
        students.forEach(c-> System.out.println(c.printInfo()));
        students.add(person4);
        System.out.println(students.size());
        students.forEach(c-> System.out.println(c.printInfo()));


        }


    }

