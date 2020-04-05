package hw12;

public class App {
    public static void main(String[] args) {
        Players ronaldo=new Players("Cristiano","Ronaldo",1985,"Real Madrid","Portugal","striker");
        Coaches mourinho= new Coaches("Jose","Mourihno", 1965,"Tottenham","Portugal",15);
        Starting11 deGea= new Starting11("David","DeGea",1990, "Man Utd","Spain","goalkeeper",233);
        System.out.println(ronaldo.getName());
        System.out.println(deGea.getPosition());
        deGea.run();

    }
}
