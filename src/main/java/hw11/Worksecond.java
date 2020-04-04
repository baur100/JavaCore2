package hw11;

public class Worksecond {
    public static void main(String[] args) {
        Airport manas =new Airport(new Plane("Boing",320,"Turkey"),new Gate ("A",36));
        Plane plane =new Plane("Boing",320,"Turkey");
        Gate gate =new Gate("A",36);

         manas.printInfo();
    }
}
