package hw16_2;

import java.util.ArrayList;
import java.util.HashMap;

public class Work {
    public static void main(String[] args) {
        HashMap<Integer,String> rooms = new HashMap<Integer, String>();
        rooms.put(5, "General Practice");
        rooms.put(7, "Surgery");
        rooms.put(9, "Pulmonology");
        rooms.put(11, "Womens Health");
        rooms.put(13, "Pediatrics");

        Doctor doctor5 = new Doctor("Alice", "White", Position.PHYSICIAN);
        Doctor doctor7 = new Doctor("John", "Rick", Position.SURGEON);
        Doctor doctor9 = new Doctor("Matt", "Brand", Position.PULMONOLOGIST);
        Doctor doctor11 = new Doctor("Gary", "Hyman", Position.OBGYN);
        Doctor doctor13 = new Doctor("Sarah", "Ferris", Position.PEDIATRICIAN);

        ArrayList<Doctor> doctors = new ArrayList<Doctor>();
        doctors.add(0, doctor5);
        doctors.add(1, doctor7);
        doctors.add(2, doctor9);
        doctors.add(3, doctor11);
        doctors.add(4, doctor13);

        ArrayList<InsuranceCompanies> insurances = new ArrayList<InsuranceCompanies>();
        insurances.add(0, InsuranceCompanies.AETNA);
        insurances.add(1, InsuranceCompanies.CIGNA);
        insurances.add(2, InsuranceCompanies.BCBS);
        insurances.add(3, InsuranceCompanies.KAISER);
        insurances.add(4, InsuranceCompanies.UNITEDHEALTH);

        Address address = new Address ("1035 116th Ave NE", "Bellevue", "WA", 98004);

        Hospital overLake = new Hospital("Overlake Medical Center", address,
                doctors, rooms, insurances);
        overLake.printInfo();
        System.out.println();
        overLake.printDoctors();
        System.out.println();
        overLake.directory();

    }
}
