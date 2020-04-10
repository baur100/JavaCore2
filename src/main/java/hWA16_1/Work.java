package hWA16_1;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Work {
    public static void main(String[]args) {
        Address address1 = new Address("132, Howard Blvd", "Irvine", "CA", 92604);
        Doctor doctor1 = new Doctor("Henry", "Voge", Position.ALLERGOLOG);
        Doctor doctor2 = new Doctor("Nancy", "Cromvel", Position.CARDIOLOG);
        Doctor doctor3 = new Doctor("Kira", "Vagner", Position.OTOLARINGOLOG);
        Doctor doctor4 = new Doctor("Zhi", "Chang", Position.PHYSICIAN);
        ArrayList<Doctor> doctors = new ArrayList<Doctor>();
        doctors.add(0, doctor1);
        doctors.add(1, doctor2);
        doctors.add(2, doctor3);
        doctors.add(3, doctor4);
        HashMap<Integer, String> rooms = new HashMap<>();
        rooms.put(1, "Gastroenterology");
        rooms.put(0, "Alergology");
        rooms.put(3, "Oftalmology");
        rooms.put(2, "Otolaringology");
        rooms.put(4, "Generalist");
        ArrayList<InsuranceCompanies> acceptInsurances = new ArrayList<>();
        acceptInsurances.add(0, InsuranceCompanies.AETNA);
        acceptInsurances.add(1, InsuranceCompanies.NATIONAL_GENERAL);
        acceptInsurances.add(2, InsuranceCompanies.PIVOT);
        acceptInsurances.add(3, InsuranceCompanies.UNITEDHEALTHCARE);


        Hospital hospital1 = new Hospital("Hoag Irvine", address1,acceptInsurances);

        hospital1.printInfo();


        for(Doctor x:doctors){
            System.out.println( x.printInfo());
        }

        System.out.println("Rooms of the hospital:");

        for (Map.Entry<Integer,String> kv:rooms.entrySet()){
            System.out.println( +kv.getKey()+" - "+ kv.getValue());
        }


    }
}
