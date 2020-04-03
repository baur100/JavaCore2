package hw_11_part2;

public class Casino {
    private String name;
    private String slotMachines;
    private int employees;
    private String address;

    public Casino(){}

    public Casino(String name, String slotMachines, int employees, String address) {
        this.name = name;
        this.slotMachines = slotMachines;
        this.employees = employees;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public String getSlotMachines() {
        return slotMachines;
    }

    public void setSlotMachines(String slotMachines) {
        this.slotMachines = slotMachines;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void printInfo(){
        System.out.println("Casino details: " + name + ";" + slotMachines + ";" + employees + ";" + address);
    }

}
