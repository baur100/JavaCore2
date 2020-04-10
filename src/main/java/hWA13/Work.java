package hWA13;

public class Work {
    public static void main(String[]args){
        Animals jaguar = new Jaguar(15,"fresh meat","yellow jaguar","tropical forest");
        System.out.println(jaguar.toString());
        jaguar.breath();
        jaguar.maxAge();
        jaguar.move();
        jaguar.song();
        System.out.println("___________");

        Animals cow = new Cow(10,"fresh and dry herbs", "Burenka","ferm");
        Animals xx=cow;
        System.out.println(xx.toString());
        xx.song();
        xx.move();
        xx.breath();


    }
}
