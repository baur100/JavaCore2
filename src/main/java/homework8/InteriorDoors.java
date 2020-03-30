package homework8;

public class InteriorDoors {
    public String type;
    public String model;
    public int size;
    public String casing;
    public String hole;

    public void bam(){
        System.out.println("Я ударился мезинцем об эту "+type+" "+model+" "+size+" inch дверь");
    }
    public void creak() {
        System.out.println("Эта "+type+" "+model+" "+size+" inch door"+" скрипит как телега");
    }
}
