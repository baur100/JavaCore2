package HW16;

import java.util.HashMap;
import java.util.Map;

public class Person1 {
    public static void main(String[] args) {
        Map<String, String> student = new HashMap<String, String>();
        student.put("Ivan", "Ivanov");
        student.put("Petr", "Petrov");
        student.put("Sergey", "Sidorov");
        student.put("Victor", "Kozlov");

        System.out.println(student.size());
        System.out.println(student.get(("Petr")));
        student.remove("Victor");
        student.put("Ivan", "Ivanovich");
        System.out.println(student);

        for (Map.Entry<String, String> kv : student.entrySet()) {
            System.out.println(kv.getKey());
            System.out.println(kv.getValue());
        }
    }
}
