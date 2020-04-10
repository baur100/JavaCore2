package hw16_2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address address;
    private ArrayList<Doctor> doctors;
    private HashMap<Integer,String> rooms;
    private ArrayList<InsuranseCompamies> acceptedInsuranses;


    public Hospital(String hospitalName, Address address, ArrayList<InsuranseCompamies> acceptedInsuranses) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.acceptedInsuranses = acceptedInsuranses;
    }

    public Hospital(String hospitalName, Address address, ArrayList<Doctor> doctors, HashMap<Integer, String> rooms, ArrayList<InsuranseCompamies> acceptedInsuranses) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsuranses = acceptedInsuranses;

    }
    public  void printInfo(){
        System.out.println(hospitalName);
        address.printInfo();
        System.out.println(acceptedInsuranses);

    }
//    public void printDoctors(){
//        for (Doctor x: doctors){
//            System.out.println(x.printDoctor();
//        }
//
//    }



//    public void printRoom() {
//        for (Map.Entry<Integer, String> x : rooms.entrySet()) {
//            System.out.println(x.getKey());
//            System.out.println(x.getValue());
//        }
//    }
    
    public void printRoom(){
        System.out.println(rooms);
    }


    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
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

    public ArrayList<InsuranseCompamies> getAcceptedInsuranses() {
        return acceptedInsuranses;
    }

    public void setAcceptedInsuranses(ArrayList<InsuranseCompamies> acceptedInsuranses) {
        this.acceptedInsuranses = acceptedInsuranses;
    }


}
