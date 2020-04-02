package hw11_z;

public class Listening {
    private String name;
    private String type;
    private int zip;
    private String status;

    public Listening(String name, String type, int zip, String status) {
        this.name = name;
        this.type = type;
        this.zip = zip;
        this.status = status;
    }

    public void printListening() {
        String listening = "Listening{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", zip=" + zip +
                ", status='" + status + '\'' +
                '}';
        System.out.println(listening);
    }
}
