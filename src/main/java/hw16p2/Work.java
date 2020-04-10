package hw16p2;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Work {
  public static void main(String[] args) {


    Address address = new Address("20, Market St", "San Francisco","CA",93030);





        Doctor doctor = new Doctor("Richard","Brown",Position.PHYSICIAN);
        Doctor doctor1 = new Doctor("George","Jackson",Position.DENTIST);
        Doctor doctor2 = new Doctor("Chris","Delgado",Position.CARDIOLOGIST);
        Doctor doctor3 = new Doctor("Peter","Lee",Position.GASTROENTEROLOGIST);
        ArrayList<Doctor>doctors= new ArrayList<Doctor>();
        doctors.add(doctor);
        doctors.add(doctor1);
        doctors.add(doctor2);
        doctors.add(doctor3);





        HashMap<Integer,String> rooms = new HashMap<>();
        rooms.put(22,"Gastroenterology");
        rooms.put(23,"Physiology");
        rooms.put(21,"Dentistry");
        rooms.put(25,"Cardiology");

        ArrayList<InsuranceCompany> acceptedInsurances = new ArrayList<>();
        acceptedInsurances.add(0,InsuranceCompany.AETNA);
        acceptedInsurances.add(1,InsuranceCompany.UnitedHealthCare);
        acceptedInsurances.add(2,InsuranceCompany.BlueCross);



        Hospital mayoClinic= new Hospital("Mayo Clinic",address,doctors,rooms,acceptedInsurances);
        mayoClinic.printInfo();
        System.out.println();
        mayoClinic.printDoctors();
        System.out.println();
        mayoClinic.directory();



    }

}
