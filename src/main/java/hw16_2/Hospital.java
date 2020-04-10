package hw16_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address address;
    private ArrayList<Doctor> doctors;
    private HashMap<Integer, String> rooms;
    private ArrayList<InsuranceCompanies> acceptedInsurance;

    public Hospital(String hospitalName, Address address, ArrayList<Doctor> doctors, HashMap<Integer, String> rooms, ArrayList<InsuranceCompanies> acceptedInsurance) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsurance = acceptedInsurance;
    }


    public void prinHospitalInfo(){
        System.out.println(hospitalName+"\n"+address.printAddress()+"\nThis hospital accepts the following insurance: ");
        acceptedInsurance.forEach(x-> System.out.println(x));
    }

    public void printDoctorsList(){
        System.out.println("Doctors: ");
        doctors.forEach(x-> System.out.println(x.printDoctor()));
    }

    public void printCabs(){
        System.out.println("Directory: ");
        rooms.forEach((x,y)-> System.out.println(x+" -> "+y));
    }
}
