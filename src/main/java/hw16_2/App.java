package hw16_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        Address address = new Address("534 Oak Pkwy", "Arlington", "Texas", 75222);

        Doctors doc1 = new Doctors("Poul Finger", Positions.OPHTHALMOLOGIST);
        Doctors doc2 = new Doctors("Stefany May", Positions.NEUROLOGIST);
        Doctors doc3 = new Doctors("Kim Main", Positions.GYNECOLOGIST);
        Doctors doc4 = new Doctors("Alton Sherman", Positions.PHYSICIAN);
        Doctors doc5 = new Doctors("Henry Crivy", Positions.PEDIATRICIAN);

        List<Doctors> doctors = new ArrayList<Doctors>();
        doctors.add(0, doc1);
        doctors.add(1, doc2);
        doctors.add(2, doc3);
        doctors.add(3, doc4);
        doctors.add(4, doc5);



        Map<Integer, String> room = new HashMap<Integer, String>();
        room.put(22, "Physician");
        room.put(37, "Neurologist");
        room.put(29, "Ophtalmologist");
        room.put(42, "Pediatrician");
        room.put(11, "Ginecologist");



        List<InsuranceCompanies> acceptedInshurance = new ArrayList<InsuranceCompanies>();
        acceptedInshurance.add(0, InsuranceCompanies.ANTHEM);
        acceptedInshurance.add(1, InsuranceCompanies.BLUECROSSBLUESHIELD);
        acceptedInshurance.add(2, InsuranceCompanies.HUMANA);
        acceptedInshurance.add(3, InsuranceCompanies.CVS);
        acceptedInshurance.add(4, InsuranceCompanies.UNATEDHEALTH);
        acceptedInshurance.add(5, InsuranceCompanies.WELLCARE);



        Hospital hospital = new Hospital("TEXAS HEALTH HOSPITAL", address, doctors, room, acceptedInshurance);
        hospital.printInfo();

    }
}

