package hwr16;

import java.util.ArrayList;
import java.util.List;

public class Work162 {
    public static void main(String[] args) {
        Doctor doctor1=new Doctor("Oleg","Petrov",Position.Cardiologist);
        var doctor2=new Doctor("Igor","Ivanov",Position.Dermatologist);
        var doctor3=new Doctor("Dan","Asanov",Position.Pediatrician);
        var doctor4=new Doctor("Nastya","Okinova",Position.Surgeon);
        var doctor5=new Doctor("Asel","Akunova",Position.Physician);
        List<Doctor> doctors= new ArrayList<>();
        doctors.add(doctor1);
        doctors.add(doctor2);
        doctors.add(doctor3);
        doctors.add(doctor4);
        doctors.add(doctor5);
        System.out.println(doctors);
    }
}
//    pivate HashMap<Integer,String> rooms; (список кабинетов и их название - пример комната 22 - Gastroenterology rooms.put(22,"Gastroenterology") )
//        - private ArrayList<InsuranseCompamies> acceptedInsuranses; список принимаемых страховок.
//        (Enum InsuranseCompamies - enum of Insuranses,  например InsuranseCompamies.AETNA, InsuranseCompamies.UnitedHealthcare)
//        Методы:
//        - Вывести на печать название, адрес и список Иншурансов которые принимает больница - public void printInfo();
//        - Вывести на печать список врачей и их должности - public void printDoctors();
//        - Вывести на печать все кабинеты с номерами и их названиямиж
