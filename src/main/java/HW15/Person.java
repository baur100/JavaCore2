package HW15;

import java.util.ArrayList;
import java.util.List;

public class Person {
    public static void main(String[] args) {
        List<String> student = new ArrayList<>();
        student.add("Ivanov");
        student.add("Petrov");
        student.add("Sidorov");
        student.add("Kozlov");

        student.add(4, "Xromov");
        student.set(3, "Kobunko");
        student.get(2);
        student.remove("Petrov");
        System.out.println(student.get(0));
        System.out.println(student);

        for (String v : student) {
            System.out.println(v);
        }
        student.forEach(x -> System.out.println(x));
        student.forEach(System.out::println);

    }
}