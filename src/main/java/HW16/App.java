package HW16;

import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        Address address = new Address("2435", "Sacramento", "CA", 95821);

        Doctor vanya =  new Doctor("Ivan","Ivanov", Position.CARDIOLOGY);
        Doctor petr = new Doctor("Petr", "Petrov", Position.PHYSICIAN);
        Doctor vycheslav = new Doctor("Slava","Sidorov", Position.DENTAL);
        Doctor elena = new Doctor("Elena", "Ivanovich", Position.SURGERY);
        Doctor nikolay = new Doctor("Nick", "Nikolaenko", Position.PHLEBOTOMY);

        ArrayList<Doctor> doctors = new ArrayList<Doctor>();
        doctors.add(vanya);
        doctors.add(petr);
        doctors.add(vycheslav);
        doctors.add(elena);
        doctors.add(nikolay);

        HashMap<Integer, String> rooms = new HashMap<>();
        rooms.put(100,"Cardiology");
        rooms.put(200,"Phlebotomy");
        rooms.put(300,"Surgery");
        rooms.put(400,"Dental");
        rooms.put(500,"Physician");

        ArrayList<InsuranceCompanies> insuranceList = new ArrayList<>();
        insuranceList.add(InsuranceCompanies.UNITEDHEALTHCARE);
        insuranceList.add(InsuranceCompanies.AETNA);
        insuranceList.add(InsuranceCompanies.HEALTHNET);
        insuranceList.add(InsuranceCompanies.BLUECROSS);
        insuranceList.add(InsuranceCompanies.KAISER);

        Hospital service = new Hospital("Kaiser Permanente", address, doctors, rooms, insuranceList);
        service.printHospitalInfo();
        service.printDoctorsList();
        service.printCabs();

    }
}