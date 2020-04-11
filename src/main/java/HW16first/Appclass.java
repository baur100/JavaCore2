package HW16first;

import java.util.HashMap;
import java.util.Map;

public class Appclass {
    public static void main(String[] args) {
        Map<Person,Job> qa = new HashMap<>();
        Person a = new Person("Denis","Maximov");
        Job b1 = new Job("QA");
        qa.put(a,b1);
        qa.put(new Person("Anrey","Sakolnikov"),new Job("Manager"));
        qa.put(new Person("Olga","Sarokova"), new Job("QALead"));
        Person a2 = new Person("Anna","Kitova");
        Job b2 = new Job("Prdowner");
        qa.put(a2,b2);
        System.out.println(qa);

        qa.replace(a,new Job("God"));
        System.out.println(qa.get(a));
        System.out.println(qa);

        qa.remove(a2);
        System.out.println(qa);
    }
}
