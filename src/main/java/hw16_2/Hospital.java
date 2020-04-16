package hw16_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address address;
    private List<Doctors>doctors;
    private Map<Integer,String>room;
    private List<InsuranceCompanies>acceptedInsurance;



    public Hospital(String hospitalName, Address address, List<Doctors> doctors, Map<Integer, String> room, List<InsuranceCompanies> acceptedInsurance) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.room = room;
        this.acceptedInsurance=acceptedInsurance;

    }

    public void printInfo(){
        System.out.println("Hospital name:  " + hospitalName);
        address.printInfo();

        System.out.println("Every Monday, Wednesday, Friday (from 9:00 a.m. to 3:00 p.m.) visit our doctors:  ");
        room.forEach((a,b)-> System.out.println("Room # "+ a + ": " + b));

        System.out.println("List of Doctors:");
        doctors.forEach(doc->doc.printInfoDoc());


        System.out.println("List of accepted insurances in TEXAS HEALTH HOSPITAL:\n" + acceptedInsurance);

        System.out.println("WELCOME TO TEXAS HEALTH HOSPITAL" + "\nTHANK YOU FOR COMING");


    }
}
