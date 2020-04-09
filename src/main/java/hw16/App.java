package hw16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        // HOMEWORK 16 - PART 1

        System.out.println("\033[31;1m\nHOMEWORK - PART 1\n\033[0m");
        Map<String, String> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();
        Map<Item, Location> map3 = new HashMap<>();

        Item i1 = new Item("Pen", 3.5);
        Item i2 = new Item("Pencil", 1.5);
        Item i3 = new Item("Screwdriver", 5.99);
        Item i4 = new Item("Hammer", 50.99);

        Location l1 = new Location("LOS ANGELES", "US");
        Location l2 = new Location("MOSCOW", "RUSSIA");
        Location l3 = new Location("ALMATY", "KAZAKHSTAN");
        Location l4 = new Location("DENVER", "US");

        // PUT METHOD

        map1.put("DOG", "CHARLIE");
        map1.put("CAT", "CEASER");
        map1.put("HAMSTER", "ALBERT");
        map1.put("PARROT", "JACK");
        map1.forEach((x, y) -> System.out.println(x + " - " + y));

        System.out.println("**********************************");
        map2.put(1, "S1");
        map2.put(2, "S2");
        map2.put(3, "S3");
        map2.put(4, "S4");
        map2.forEach((x, y) -> System.out.println(x + " - " + y));
        System.out.println("**********************************");

        map3.put(i1, l1);
        map3.put(i2, l2);
        map3.put(i3, l3);
        map3.put(i4, l4);
        map3.forEach((x, y) -> System.out.println(x.toString() + " - " + y.toString()));
        System.out.println("**********************************");

        // REPLACE METHOD

        map1.replace("CAT", "MAX");
        map1.forEach((x, y) -> System.out.println(x + " - " + y));
        System.out.println("**********************************");
        map2.replace(4, "S5");
        map2.forEach((x, y) -> System.out.println(x.toString() + " - " + y));
        System.out.println("**********************************");
        map3.replace(i4, l2);
        map3.forEach((x, y) -> System.out.println(x + " - " + y));
        System.out.println("**********************************");

        // REMOVE METHOD

        map1.remove("DOG");
        map1.forEach((x, y) -> System.out.println(x + " - " + y));
        System.out.println("**********************************");
        map2.remove(2);
        map2.forEach((x, y) -> System.out.println(x.toString() + " - " + y));
        System.out.println("**********************************");
        map3.remove(i4, l2);
        map3.forEach((x, y) -> System.out.println(x + " - " + y));
        System.out.println("**********************************");

        // GET METHOD

        System.out.println(map1.get("PARROT"));
        System.out.println("**********************************");
        System.out.println(map2.get(3));
        System.out.println("**********************************");
        System.out.println(map3.get(i1));
        System.out.println("**********************************");

        // HOMEWORK 16 - PART 2

        // Declare and initialize rooms HashMap
        System.out.println("\033[31;1m\nHOMEWORK - PART 2\n\033[0m");
        Address address = new Address("132 Highland Ave", "Hollywood", "CA", 91705);

        HashMap<Integer, String> rooms = new HashMap<>()
        {{
            put(10, "ER");
            put(22, "SURGERY");
            put(11, "WARD");
            put(21, "THEATER");
            put(12, "NURSERY");
        }};

        // Declare and initialize doctors and add them to ArrayList
        Doctor doc1 = new Doctor("John", "Smith", Position.CARDIOLOGIST);
        Doctor doc2 = new Doctor("Frank", "Garcia", Position.PHYSICIAN);
        Doctor doc3 = new Doctor("John", "Doe", Position.PEDIATRICIAN);
        Doctor doc4 = new Doctor("Jim", "Jones", Position.SURGEON);
        Doctor doc5 = new Doctor("Anna", "Moore", Position.DERMATOLOGIST);

        // ArrayList of doctors
        List<Doctor> doctors = new ArrayList<>(List.of(doc1, doc2, doc3, doc4, doc5));

        // ArrayList of Insurance Companies
        List<InsuranceCompanies> insCompanies = InsuranceCompanies.stream()
                .collect(Collectors.toList());

        Hospital hospital = new Hospital("Kaiser", address, doctors, rooms, insCompanies);

        hospital.printBasicInfo();
        hospital.printDoctors();
        hospital.printRooms();
    }
}
