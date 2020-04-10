package hw16_2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {


        Address address1 = new Address("123 main str","York","PA",17404);

        ArrayList<InsuranseCompamies>acceptedInsuranses = new ArrayList<>();
        acceptedInsuranses.add(0, InsuranseCompamies.AETNA);
        acceptedInsuranses.add(1,InsuranseCompamies.BLUECROSS);
        acceptedInsuranses.add(2, InsuranseCompamies.DELTA);
        acceptedInsuranses. add(3,InsuranseCompamies.GATEWAY);
        acceptedInsuranses.add(4,InsuranseCompamies.SIGNA);

        Hospital hospital = new Hospital("York Hospital",address1,acceptedInsuranses);

      hospital.printInfo();
        System.out.println();

//        Doctor d1 = new Doctor("aa", "ss",Position.ENDOCRYNOLOGYST);
//        Doctor d2 = new Doctor("zz","xx",Position.ONCOLOGIST);
//        Doctor d3 = new Doctor("qq","ww", Position.PHISICIAN);
//        Doctor d4 = new Doctor("rr","tt", Position.SURGERY);
//        Doctor d5 = new Doctor("ss","dd",Position.TERAPIST);
//
//        List<Doctor> doctors = new ArrayList<>();
//        doctors.add(0,d1);
//        doctors.add(1,d2);
//        doctors.add(2,d3);
//        doctors.add(4,d5);

//       hospital.printDoctors();

        System.out.println("****************************");

        Map<Integer, String> rooms=new HashMap<>();
         rooms.put(11,"Endocrinologist");
         rooms.put(22, "oncologist");
         rooms.put(33,"phisitian");
         rooms.put(44," surgery");
         rooms.put(55, "terapy");

       hospital.printRoom();





















        }

}
