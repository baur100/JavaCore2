package HW9;

public class aircraft {

    public String type;
    public String category;
    public String name;
    public int capacity;
    public int crewReq;
    public int runwayReq;
    public String fuel;
    public boolean coffee;


    public boolean airworthy(String pilotName, String license, String position){
        boolean ready = false;
        if (position == "Captain" && name == "A320" && license == "ATPL") {
                System.out.println(name + " is ready for boarding and departing with Captain " + pilotName);
                ready = true;
        }

        else if (name == "C172" && (license == "CPL" || license == "ATPL")) {
            System.out.println(name + " is ready for boarding and departing with Captain " + pilotName);
            ready = true;
        }
        //if (license == null || license != "CPL" && license != "ATPL")
        else {
            ready = false;
            System.out.println("Mr. " + pilotName + " needs another pilot certificate to fly " + name);
        }

        return ready;
    }

    public void boarding(String namePax){
        System.out.println("Mr. " + namePax + " we are happy to see you in this " + name);
    }

}
