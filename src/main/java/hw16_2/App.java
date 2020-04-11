package hw16_2;

import java.util.*;

public class App {
    public static void main(String[] args) {

        Address address = new Address("801 K St", "Sacramento", "California", 95816);

        Doctor doctor1 = new Doctor("Ivan", "Rodnov", Position.SURGEON);
        Doctor doctor2 = new Doctor("Rick", "Albedo", Position.CARDIOLOGIST);
        Doctor doctor3 = new Doctor("Ron", "Strock", Position.DERMATOLOGIST);
        Doctor doctor4 = new Doctor("Lisa", "Murray", Position.OBSTETRICIAN);
        Doctor doctor5 = new Doctor("Vanessa", "Snelson", Position.PSYCHIATRIST);

        ArrayList<Doctor> doctors = new ArrayList<>(Arrays.asList(doctor1, doctor2, doctor3, doctor4, doctor5));

        HashMap<Integer, String> rooms = new HashMap<>();
        rooms.put(22, "Casualty Room");
        rooms.put(24, "Consulting Room");
        rooms.put(27, "Day Room");
        rooms.put(34, "Delivery Room");
        rooms.put(11, "Dispensary Room");
        rooms.put(4, "Emergency Room");

        ArrayList<InsuranceCompanies> acceptedInsurances = new ArrayList<>(Arrays.asList(InsuranceCompanies.BERKSHIRE,
                InsuranceCompanies.INGGROUP, InsuranceCompanies.METLIFE,
                InsuranceCompanies.PRUDENTIALFINANCIAL, InsuranceCompanies.UNITEDHEALTHGROUP));

        Hospital hospital = new Hospital("Mercy", address, doctors, rooms, acceptedInsurances);

        System.out.println("----------------------------");
        System.out.println(hospital.printInfo(hospital.getHospitalName(), address, acceptedInsurances));
        System.out.println("----------------------------");
        doctors.forEach(x -> System.out.println(x));
        System.out.println("----------------------------");
        rooms.forEach((x, y) -> System.out.println("# " + x + " " + y));

    }
}
