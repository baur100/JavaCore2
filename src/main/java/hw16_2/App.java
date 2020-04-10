package hw16_2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        //HOSPITAL ADDRESS
        Address address = new Address(100, "Main street", "Los Angeles", "CA", 90001);

        //DOCTORS
        Doctor alex =  new Doctor("Alex","Shmidt",Position.PEDIATRICIAN);
        Doctor mary = new Doctor("Mary", "Wallas", Position.PHYSICIAN);
        Doctor anna =  new Doctor("Anna","West",Position.GASTROENTEROLOGIST);
        Doctor lisa = new Doctor("Elisabeth", "Turner", Position.SURGEON);
        Doctor sophia =  new Doctor("Sophia","Trenton",Position.PEDIATRICIAN);
        Doctor mark = new Doctor("Mark", "White", Position.PHLEBOTOMIST);

        //doctorsList
        ArrayList<Doctor> doctors = new ArrayList<Doctor>();
        doctors.add(alex);
        doctors.add(mary);
        doctors.add(anna);
        doctors.add(lisa);
        doctors.add(sophia);
        doctors.add(mark);

        //ROOMS
        HashMap<Integer, String> rooms = new HashMap<>();
        rooms.put(150,"Gastroenterology");
        rooms.put(100,"Phlebotomist");
        rooms.put(300,"Surgeon");
        rooms.put(210,"Pediatrician");
        rooms.put(212,"Pediatrician");
        rooms.put(301,"Physician");

        //Insurance
        ArrayList<InsuranceCompanies> insuranceList = new ArrayList<>();
        insuranceList.add(InsuranceCompanies.LACARE);
        insuranceList.add(InsuranceCompanies.AETNA);
        insuranceList.add(InsuranceCompanies.ANTHEM);
        insuranceList.add(InsuranceCompanies.BLUECROSS);
        insuranceList.add(InsuranceCompanies.KAISER);

        //Hospital
        Hospital providence = new Hospital("Providence Holy Cross", address, doctors, rooms, insuranceList);

       //ывести на печать название, адрес и список Иншурансов которые принимает больница
        providence.prinHospitalInfo();
        System.out.println("********************");

        //Вывести на печать список врачей и их должности
        providence.printDoctorsList();
        System.out.println("********************");

        //Вывести на печать все кабинеты с номерами и их названиями
        providence.printCabs();
        System.out.println("********************");

    }
}
