package hWA16;

public class Artist {
    private String name;
    private String lastname;

    public Artist(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }
    public String ptintInfo(){
        return "Name of artist: "+name+" "+lastname;
    }
}
