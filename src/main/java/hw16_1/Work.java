package hw16_1;

import java.util.HashMap;
import java.util.Map;

public class Work {
    public static void main(String[] args) {
        Map<String,String> cars = new HashMap<String, String>();
        cars.put("bmw", "M3");
        cars.put("benz", "E63");
        cars.put("audi", "RS6");
        cars.put("volvo", "XC60");
        System.out.println(cars);
        cars.replace("audi", "RS4");
        System.out.println(cars);
        cars.remove("volvo");
        System.out.println(cars);
        System.out.println(cars.get("audi"));

        System.out.println();
        for (Map.Entry<String,String> kv:cars.entrySet()){
            System.out.println(kv.getKey());
            System.out.println(kv.getValue());
        }
        System.out.println();
        for (String key: cars.keySet()){
            System.out.println(key);
        }
        System.out.println();
        for (String value:cars.values()){
            System.out.println(value);
        }
        System.out.println();

        Map<Integer,String> numbers= new HashMap<>();
        numbers.put(10, "ten");
        numbers.put(20, "twenty");
        numbers.put(30, "thirty");
        numbers.put(40, "fourty");
        System.out.println(numbers);
        numbers.replace(40, "forty");
        System.out.println(numbers);
        numbers.remove(10);
        System.out.println(numbers);
        System.out.println(numbers.get(30));
        System.out.println();

        System.out.println();
        for (Map.Entry<Integer,String> kv:numbers.entrySet()){
            System.out.println(kv.getKey());
            System.out.println(kv.getValue());
        }
        System.out.println();
        for (Integer key: numbers.keySet()){
            System.out.println(key);
        }
        System.out.println();
        for (String value:numbers.values()){
            System.out.println(value);
        }
        System.out.println();
        Employee petrov = new Employee("Ivan", "Petrov", "manager");
        Employee andreeva = new Employee("Olga", "Andreeva", "cashier");
        Employee white = new Employee("Kevin", "White", "technician");
        Employee rick = new Employee("John", "Rick", "engineer");

        Salary a = new Salary(120000, "$");
        Salary b = new Salary(50000, "$");
        Salary c = new Salary(65000, "$");
        Salary d = new Salary(110000, "$");
        Salary e = new Salary(40000, "$");


        Map<Employee, Salary> wages = new HashMap<>();
//        salary.put(new Employee("Ivan", "Petrov", "manager"), new Salary(120000, "$"));
//        salary.put(new Employee("Olga", "Andreeva", "cashier"), new Salary(50000, "$"));
//        salary.put(new Employee("Kevin", "White", "technician"), new Salary(65000, "$"));
//        salary.put(new Employee("John", "Rick", "engineer"), new Salary(110000, "$"));
        wages.put(petrov, a);
        wages.put(andreeva, b);
        wages.put(white, c);
        wages.put(rick, d);
        System.out.println(wages.size());
        wages.replace(andreeva, e);
        System.out.println(wages.get(andreeva).getAmount());
        wages.remove(petrov);
        System.out.println(wages.get(petrov));

        System.out.println();
        for (Map.Entry<Employee,Salary> kv:wages.entrySet()){
            System.out.println(kv.getKey().employee());
            System.out.println(kv.getValue().salary());
        }
        System.out.println();
        for (Employee key: wages.keySet()){
            System.out.println(key.employee());
        }
        System.out.println();
        for (Salary value:wages.values()){
            System.out.println(value.salary());
        }

    }

}
