package hwr16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Work162 {
    public static void main(String[] args) {

        Doctor doctor1 = new Doctor("Oleg", "Petrov", Position.Cardiologist);
        var doctor2 = new Doctor("Igor", "Ivanov", Position.Dermatologist);
        var doctor3 = new Doctor("Dan", "Asanov", Position.Pediatrician);
        var doctor4 = new Doctor("Nastya", "Okinova", Position.Surgeon);
        var doctor5 = new Doctor("Asel", "Akunova", Position.Physician);
        List<Doctor> doctors = new ArrayList<>();
        doctors.add(doctor1);
        doctors.add(doctor2);
        doctors.add(doctor3);
        doctors.add(doctor4);
        doctors.add(doctor5);
        System.out.println(doctors);
        System.out.println("----------------------------------------------------------------------");

        Map<Integer, String> rooms = new HashMap<>();
        rooms.put(21, "Cardiologist");
        rooms.put(22, "Dermatologist");
        rooms.put(23, "Pediatrician");
        rooms.put(24, "Surgeon");
        rooms.put(25, "Physician");
        for (Map.Entry<Integer, String> r : rooms.entrySet()) {
            System.out.println(r.getValue() + " " + "rooms # " + r.getKey());
        }
        System.out.println("-------------------------------------------------------------------");
        Address a1 = new Address("2828 Long Reach dr", "Sugar Land", "TX", 77479);
        Address a2 = new Address("4747 LJ Pkwy", "Houston", "Texas", 77071);
        Address a3 = new Address("8080 Hwy 6 ", "Conroe", "TX", 77459);
        Address a4 = new Address("5858 New Territory blvd", "Dallas", "TX", 77050);

        Hospital h1 = new Hospital("Memorial", a1);
        Hospital h2 = new Hospital("Methodist", a2);
        Hospital h3 = new Hospital("Heart Center", a3);
        Hospital h4 = new Hospital("Atrium", a4);

        Map<Hospital, InsuranceCompanies> info = new HashMap<>();
        info.put(h1, InsuranceCompanies.Aetna);
        info.put(h2, InsuranceCompanies.Ambetter);
        info.put(h3, InsuranceCompanies.Cigna);
        info.put(h4, InsuranceCompanies.Humana);
        for (Map.Entry<Hospital, InsuranceCompanies> i : info.entrySet()) {
            System.out.println("Hospital" + " " + i.getKey() + " " + " accepted Insuranses " + "' " + i.getValue() + "'");


        }
    }
}


//    pivate HashMap<Integer,String> rooms; (список кабинетов и их название - пример комната 22 - Gastroenterology rooms.put(22,"Gastroenterology") )
//        - private ArrayList<InsuranseCompamies> acceptedInsuranses; список принимаемых страховок.
//        (Enum InsuranseCompamies - enum of Insuranses,  например InsuranseCompamies.AETNA, InsuranseCompamies.UnitedHealthcare)
//        Методы:
//        - Вывести на печать название, адрес и список Иншурансов которые принимает больница - public void printInfo();
//        - Вывести на печать список врачей и их должности - public void printDoctors();
//        - Вывести на печать все кабинеты с номерами и их названиямиж
