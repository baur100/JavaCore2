package hw_16_part2;

import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {
    private String hospitalName;
    private Address address;
    private ArrayList<Doctor>doctors;
    private HashMap<Integer,String> rooms;
    private ArrayList<InsuranceCompanies> acceptedInsurances;


    public Hospital(String hospitalName, Address address, ArrayList<Doctor> doctors, HashMap<Integer, String> rooms, ArrayList<InsuranceCompanies> acceptedInsurances) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsurances = acceptedInsurances;
    }

    public void printInfo() {
        System.out.println("Hospital name = "+hospitalName);
        address.printInfo();
        doctors.forEach(doc->doc.printInfo());
        rooms.forEach((roomNumber,roomName)-> System.out.println(roomNumber+"-->"+roomName));
        System.out.println(" List of accepted insurances:");
        acceptedInsurances.forEach(value-> System.out.println(value));

    }
}
