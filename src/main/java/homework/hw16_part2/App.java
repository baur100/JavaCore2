package homework.hw16_part2;

import homework.hw16_part2.Address;
import homework.hw16_part2.State;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        //Address
        var address1 = new Address(123, "New st", "Los Angeles", State.CA, 90643);
        var address2 = new Address(45, "Bardstown Rd", "Louisville", State.KY, 40204);
        var address3 = new Address(67, "Old St", "Tampa", State.FL, 54980);

        //Doctors
        var doctor1 = new Doctor("Richard", "Roberts", Position.DENTIST);
        var doctor2 = new Doctor("Susan", "Shaw", Position.ANASTIZIOLOGIST);
        var doctor3 = new Doctor("Max", "Ivanov", Position.PHISITIAN);
        var doctor4 = new Doctor("Maria", "Rodrigez", Position.SURGEON);

        var doctors = new ArrayList<Doctor>();
        doctors.add(doctor1);
        doctors.add(doctor2);
        doctors.add(doctor3);
        doctors.add(doctor4);

        //Rooms
        var rooms = new HashMap<Integer, String>();
        rooms.put(22, "Therapy");
        rooms.put(145, "OR");
        rooms.put(146, "OR");
        rooms.put(34, "MRI");
        rooms.put(48, "Pathology");

        //Insurance Companies
        var insuranceCompanies = new ArrayList<InsuranceCompnies>();
        insuranceCompanies.add(InsuranceCompnies.AETNA);
        insuranceCompanies.add(InsuranceCompnies.UnitedHealthCare);
        insuranceCompanies.add(InsuranceCompnies.Humana);

        //Hospital
        var hospital1 = new Hospital("Baptist Health",  address1, doctors, rooms, insuranceCompanies);
        hospital1.printInfo();
        hospital1.printDoctors();
        hospital1.printRooms();


    }
}
