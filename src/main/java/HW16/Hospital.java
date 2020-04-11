package HW16;

import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {
    private String hospitalName;
    private Address address;
    private ArrayList<Doctor> doctors;
    private HashMap<Integer, String> rooms;
    private ArrayList<InsuranceCompanies> acceptedInsurance;

    public Hospital(String hospitalName, Address address, ArrayList<Doctor> doctors, HashMap<Integer, String> rooms,
                    ArrayList<InsuranceCompanies> acceptedInsurance) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsurance = acceptedInsurance;
    }

    public void printHospitalInfo() {
        System.out.println(hospitalName + "\n" + address.printAddress() + "\nOur hospital accepts the following insurance: ");
        acceptedInsurance.forEach(System.out::println);
    }

    public void printDoctorsList() {
        System.out.println("Our Doctors: ");
        doctors.forEach(x -> System.out.println(x.printDoctor()));

    }

    public void printCabs() {
        System.out.println("Our Rooms: ");
        rooms.forEach((x, y) -> System.out.println(x + " -> " + y));

    }
}
