package HW16P2;

import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {
    private String hospitalName;
    private Address address;
    private ArrayList<Doctor> doctors;
    private HashMap<Integer, String> rooms;
    private ArrayList<InsuranseCompamies> acceptedInsurances;

    public Hospital(String hospitalName, Address address, ArrayList<Doctor> doctors, HashMap<Integer, String> rooms, ArrayList<InsuranseCompamies> acceptedInsurances) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsurances = acceptedInsurances;
    }

    public Hospital() {
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }

    public HashMap<Integer, String> getRooms() {
        return rooms;
    }

    public void setRooms(HashMap<Integer, String> rooms) {
        this.rooms = rooms;
    }

    public ArrayList<InsuranseCompamies> getAcceptedInsurances() {
        return acceptedInsurances;
    }

    public void setAcceptedInsurances(ArrayList<InsuranseCompamies> acceptedInsurances) {
        this.acceptedInsurances = acceptedInsurances;
    }


    public void printInfo() {
        System.out.println(
                "Hospital " + getHospitalName() +
                ", Address: " + toString() +
                ", Accepted Insurances: " + getAcceptedInsurances());
    }

    public void printDoctors() {
        System.out.println("Hospital " + getHospitalName() + ":");
        getDoctors().forEach((d) -> System.out.println("doctor " + d.getName()+" "+ d.getLastName()+ " on position: "+d.getPosition()));
    }

    public void printRooms() {
        System.out.println( "Hospital " + getHospitalName() +
                ", Rooms: " + getRooms());
    }
    @Override
    public String toString() {
        return "Hospital address{ "+ getAddress().getStreetAddress() + ", "
                 + getAddress().getTown()+ ", "
                 + getAddress().getState()+ ", "
                 + getAddress().getZip()+  '}';
    }
}

