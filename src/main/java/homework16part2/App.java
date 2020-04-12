package homework16part2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
    Address address = new Address("100 E 77th Str", "New York", "NY", 10075);

    Doctor d1 = new Doctor("Max", "Smith", Position.Physician);
    Doctor d2= new Doctor ("Ann", "Lee", Position.Neuropathologist);
    Doctor d3 = new Doctor ("Bruce", "Lee", Position.Psychiatrist);
    Doctor d4 = new Doctor("Lena", "Petrova", Position.Optometrist);
    Doctor d5 = new Doctor("Tom", "Hardy", Position.Traumathologist);

    ArrayList<Doctor> doctors = new ArrayList<>();
    doctors.add(d1);
    doctors.add(d2);
    doctors.add(d3);
    doctors.add(d4);
    doctors.add(d5);

    HashMap<Integer, String> rooms = new HashMap<>();
    rooms.put(101, "Ordinatory");
    rooms.put(102, "Traumatology");
    rooms.put(103, "Xray");
    rooms.put(104, "Nursing room");
    rooms.put(105, "Reanimatology");

    ArrayList<InsuranceCompanies> acceptedIC = new ArrayList<>();
    acceptedIC.add(InsuranceCompanies.Aethna);
    acceptedIC.add(InsuranceCompanies.BlueCross);
    acceptedIC.add(InsuranceCompanies.Delta);
    acceptedIC.add(InsuranceCompanies.Kaiser);
    acceptedIC.add(InsuranceCompanies.MediCal);

    Hospital h1 = new Hospital("Lenox Hill", address, doctors, rooms, acceptedIC );

    h1.printInfo();

        System.out.println(doctors);
        System.out.println(rooms);
    }

}
