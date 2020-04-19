package homework.hw16_part2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address address;
    private ArrayList<Doctor> doctors;
    private HashMap<Integer, String> rooms;
    private ArrayList<InsuranceCompnies> insuranceCompnies;

    public Hospital(String hospitalName, Address address, ArrayList<Doctor> doctors, HashMap<Integer, String> rooms, ArrayList<InsuranceCompnies> insuranceCompnies) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.insuranceCompnies = insuranceCompnies;
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

    public ArrayList<InsuranceCompnies> getInsuranceCompnies() {
        return insuranceCompnies;
    }

    public void setInsuranceCompnies(ArrayList<InsuranceCompnies> insuranceCompnies) {
        this.insuranceCompnies = insuranceCompnies;
    }

    public void printInfo(){
        System.out.println("Hospital: "+this.hospitalName);
        this.address.printAddress();
        System.out.println("Insurance Companies this hospital accepts: ");
        this.insuranceCompnies.forEach(x-> System.out.print(x.toString()+" "));
        System.out.println();
        System.out.println();
    }

    public void printDoctors(){
        this.doctors.forEach(x->x.printDoctors());
        System.out.println();
    }

    public void printRooms(){
        System.out.println("Hospital Rooms: ");
        for(Map.Entry<Integer, String> kv:this.rooms.entrySet()){
            System.out.println(kv.getKey()+" - "+kv.getValue());
        }
    }
}
