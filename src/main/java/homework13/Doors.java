package homework13;

public class Doors implements Knob{
    protected String tipe;
    protected int size;
    protected String material;



    public Doors(String tipe, int size, String material) {
        this.tipe = tipe;
        this.size = size;
        this.material = material;
    }

    public Doors() {
    }


    public void scream(){
        System.out.println(tipe+" дверь, "+size+" размера, скрипит");
    }

    @Override
    public void lock() {
        System.out.println("Замок "+tipe+" двери из "+material+" закрыт");

    }

    @Override
    public void open() {
        System.out.println("Замок "+tipe+" двери из "+material+" открыт");


    }
}

