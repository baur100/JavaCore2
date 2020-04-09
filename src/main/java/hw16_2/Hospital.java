package hw16_2;

import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {
    private String hospitalName;
    private Address address;
    private ArrayList<Doctor> doctors;
    private HashMap<Integer,String> rooms;
    private ArrayList<InsuranceCompanies> acceptedInsurances;

    public Hospital(String hospitalName, Address address, ArrayList<Doctor> doctors, HashMap<Integer, String> rooms, ArrayList<InsuranceCompanies> acceptedInsurances) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsurances = acceptedInsurances;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public Address getAddress() {
        return address;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public HashMap<Integer, String> getRooms() {
        return rooms;
    }

    public ArrayList<InsuranceCompanies> getAcceptedInsurances() {
        return acceptedInsurances;
    }

    public void printInfo(){
        System.out.println(hospitalName);
        address.printInfo();
        System.out.println(acceptedInsurances);
    }
    public void printDoctors(){
        for (Doctor v:doctors) {
            System.out.println(v.printInfo());
        }
    }
    public void directory(){
        System.out.println(rooms);
    }
}
