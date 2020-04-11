package myLesson16_Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        var list = new ArrayList<Person>();
        List<Person> list1 = new ArrayList<Person>();

        list.add(new Person(15, "John"));
        list.add(new Person(20, "John"));
        list.add(new Person(16, "Mike"));
        list.add(new Person(25, "Jason"));
        list.add(new Person(35, "Bob"));

        System.out.println(list);

        System.out.println("---------------------------");
        for (var i = 0; i < list.size(); i++) {
            Person person = list.get(i);
            System.out.println(person.getName());
        }

        System.out.println("---------------------------");
        for (Person person : list) {
            System.out.println(person.getName());
        }

        System.out.println("---------------------------");
        list.forEach(x -> System.out.println(x.getName()));

        System.out.println("---------------------------");
        for (var i = 0; i < list.size(); i++) {
            Person person = list.get(i);
            if (person.getAge() > 18) {
                System.out.println(person.getName());
            }
        }
        System.out.println("---------------------------");
        for (Person person : list) {
            if (person.getAge() > 18) {
                System.out.println(person.getName());
            }
        }
        System.out.println("---------------------------");
        list.stream()
                .filter(person -> person.getAge() > 18)
                .collect(Collectors.toList())
                .forEach(person -> System.out.println(person.getName()));


        var org = new Organization("Super Company", "1 Highway, LA, CA");
        org.addBranch(new Branch(1, "NY, NY"));
        org.addBranch(new Branch(2, "KY, KY"));
        org.addBranch(new Branch(3, "WY, WY"));
        org.addBranch(new Branch(4, "Seattle, WN"));
        org.addBranch(new Branch(5, "KY, KY"));
        org.addBranch(new Branch(6, "TN, TN"));
        org.addBranch(new Branch(7, "Denver, CO"));

        List<Branch> branches = org.getBranches();

        List<String> addresses = branches.stream()
                .map(branch -> branch.getAddress())
                .collect(Collectors.toList());

        List<String> addressesTN = branches.stream()
                .map(branch -> branch.getAddress())
                .filter(y -> y == "KY, KY")
                .collect(Collectors.toList());

        System.out.println("---------------------------");
        addresses.forEach(ad -> System.out.println(ad));

        System.out.println("---------------------------");
        addressesTN.forEach(ad -> System.out.println(ad));

        var r = branches.stream()
                .anyMatch(x -> x.getNumber() == 7);

        System.out.println("---------------------------");
        System.out.println(r);

        boolean answer = true;
        for (Branch branch : branches) {
            if (branch.getNumber() == 7) {
                answer = true;
                break;
            }
            answer = false;
        }

        System.out.println("---------------------------");
        System.out.println(answer);

    }
}
