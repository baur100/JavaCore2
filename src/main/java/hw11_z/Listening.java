package hw11_z;

public class Listening {
    private String state;
    private String name;
    private String type;
    private int zip;
    private String status;

    public Listening(String state, String name, String type, int zip, String status) {
        this.state = state;
        this.name = name;
        this.type = type;
        this.zip = zip;
        this.status = status;
    }

    public String getName() { return name;
    }

    public String getState() { return state;
    }

    public String getStatus() { return status;
    }

    public String getType() { return type;
    }

    public int getZip() {
        return zip;
    }

    public void printListening() {
        String listening = "Listening{"+ name + ", State= "+state+'\'' +
                ", type='" + type + '\'' +
                ", zip=" + zip +
                ", status='" + status + '\'' +
                '}';
        System.out.println(listening);
    }
}
