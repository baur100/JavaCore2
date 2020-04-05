package hw12;

public class Players extends Team{
    private String position;


    public String getPosition() {
        return position;
    }

    public Players(String name, String lastName, int yearOfBirth, String club, String nation, String position) {
        super(name, lastName, yearOfBirth, club, nation);
        this.position = position;

    }
    public void run(){
        System.out.println(name+" is running");
    }
}
