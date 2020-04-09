package hw16;

import java.util.List;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address address;
    private List<Doctor> doctors;
    private Map<Integer, String> rooms;
    private List<InsuranceCompanies> acceptedInsurances;

    public Hospital(String hospitalName, Address address, List<Doctor> doctors, Map<Integer, String> rooms, List<InsuranceCompanies> acceptedInsurances) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsurances = acceptedInsurances;
    }

    public void printBasicInfo() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println(address.getAddress());
        System.out.print("\nAccepted Insurance Providers: "
                        + "\n**********************************\n");
        acceptedInsurances.stream()
                .filter(i -> i.getStatus().equals("Accepted"))
                .forEach(System.out::println);
        System.out.print("\nUnaccepted Insurance Providers: "
                + "\n**********************************\n");
        acceptedInsurances.stream()
                .filter(i -> i.getStatus().equals("Unaccepted"))
                .forEach(System.out::println);
    }

    public void printDoctors() {
        System.out.print("\nDoctors: " + "\n**********************************\n");
        doctors.forEach(d -> System.out.println(d.getInfo()));
    }

    public void printRooms() {
        System.out.print("\nRooms: " + "\n**********************************\n");
        rooms.forEach((room, name) -> System.out.println(room + " - " + name));
    }
}
