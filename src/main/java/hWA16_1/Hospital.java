package hWA16_1;

import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {
    private String hospitalName;
    private Address address;
    private ArrayList<Doctor> doctors;
    private HashMap<Integer,String> rooms;
    private ArrayList<InsuranceCompanies> acceptedInsurances;

    public Hospital(String hospitalName, Address address, ArrayList<Doctor> doctors, HashMap<Integer, String> rooms, ArrayList<InsuranceCompanies> acceptInacceptInsurances) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsurances = acceptInacceptInsurances;
    }
    public Hospital(String hospitalName, Address address,ArrayList<InsuranceCompanies> acceptInacceptInsurances) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.acceptedInsurances = acceptInacceptInsurances;

    }



    public String getHospitalName() {
        return hospitalName;
    }

    public Address getAddress() {
        return address;
    }

    public void printInfo(){
        System.out.println(hospitalName + "\n"+address.printInfo());
        System.out.println("List of insurances:");
        acceptedInsurances.forEach(i -> System.out.println(i));
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public HashMap<Integer, String> getRooms() {
        return rooms;
    }

    public ArrayList<InsuranceCompanies> getAcceptInacceptInsurances() {
        return acceptedInsurances;
    }

}
