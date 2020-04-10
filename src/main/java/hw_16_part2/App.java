package hw_16_part2;

import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {

        var address = new Address("233 Las Vegas blvd", "Las Vegas", "Nevada",89012);
        var doctors=new ArrayList<Doctor>();
        doctors.add(new Doctor("Joe","",Position.DOCTOR));
        doctors.add(new Doctor("Mary","Clarkson",Position.MANAGER));
        doctors.add(new Doctor("Ruslan","Karimov",Position.PHYSICIAN));
        doctors.add(new Doctor("Tynara","Sarkeshova",Position.NURSE));

        var rooms = new HashMap<Integer,String>();
        rooms.put(10,"Doctors room");
        rooms.put(11,"Mangers room");
        rooms.put(12,"Physicians room");
        rooms.put(13,"Nurses room");

        var acceptedInsurance=new ArrayList<InsuranceCompanies>();
        acceptedInsurance.add(InsuranceCompanies.BLUE_CROSS);
        acceptedInsurance.add(InsuranceCompanies.RED_CROSS);
        acceptedInsurance.add(InsuranceCompanies.TRI_CARE);
        acceptedInsurance.add(InsuranceCompanies.UNITED_HEALTH_CARE);

        var hospital = new Hospital("Southwest",address,doctors,rooms,acceptedInsurance);
        hospital.printInfo();

    }
}
