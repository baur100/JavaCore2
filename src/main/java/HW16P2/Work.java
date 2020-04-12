package HW16P2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Work {
    public static void main(String[] args) {
    //docs
        Doctor docRalf = new Doctor("Ralf", "Indrio", Position.SURGEON);
        Doctor docAlex = new Doctor("Alex", "Ivanov", Position.PHYSICIAN);
        Doctor docJohn = new Doctor("John", "Monroe", Position.CARDIOLOGIST);
        Doctor docBob = new Doctor("Bob", "Bobbins", Position.DERMATOLOGIST);

        ArrayList doctorsArr1 = new ArrayList<Doctor>();
        ArrayList doctorsArr2 = new ArrayList<Doctor>();
        ArrayList doctorsArr3 = new ArrayList<Doctor>();
        doctorsArr1.add(docAlex);
        doctorsArr1.add(docBob);
        doctorsArr2.add(docJohn);
        doctorsArr3.add(docRalf);

    //Insurances
        ArrayList InsuranceArr1 = new ArrayList<InsuranseCompamies>();
        InsuranceArr1.add(InsuranseCompamies.OSCAR);
        InsuranceArr1.add(InsuranseCompamies.COMPANY1);
        InsuranceArr1.add(InsuranseCompamies.COMPANY2);
        ArrayList InsuranceArr2 = new ArrayList<InsuranseCompamies>();
        InsuranceArr2.add(InsuranseCompamies.COMPANY1);
        InsuranceArr2.add(InsuranseCompamies.AETNA);
        InsuranceArr2.add(InsuranseCompamies.COMPANY2);

     //Rooms

        HashMap roomsArr1 = new HashMap<Integer,String>();
        HashMap roomsArr2 = new HashMap<Integer,String>();
        HashMap roomsArr3 = new HashMap<Integer,String>();

        roomsArr1.put(21, Position.PHYSICIAN);
        roomsArr1.put(11, Position.DERMATOLOGIST);
        roomsArr2.put(10, Position.CARDIOLOGIST);
        roomsArr3.put(01, Position.SURGEON);
        roomsArr3.put(02, Position.PSYCHIATRIST);

     //Hospitals

        Hospital hospital1 = new Hospital("Saint Hopkins", new Address("111 Main st.", "Columbus","OH", 19202),doctorsArr1,roomsArr1,InsuranceArr1);
        Hospital hospital2 = new Hospital("Saint Maria", new Address("23 Main st.", "Detroit","MI", 49322),doctorsArr2,roomsArr2,InsuranceArr2);
        Hospital hospital3 = new Hospital("HOPE", new Address("3323 W South st.", "Trenton","NJ", 22342),doctorsArr3,roomsArr3,InsuranceArr1);


    // Task 1
        System.out.println();
        hospital1.printInfo();
        hospital2.printInfo();
        hospital3.printInfo();


     // Task 2
        System.out.println();
        hospital1.printDoctors();
        hospital2.printDoctors();
        hospital3.printDoctors();

    // task 3
        System.out.println();
        hospital1.printRooms();
        hospital2.printRooms();
        hospital3.printRooms();


    }
}
