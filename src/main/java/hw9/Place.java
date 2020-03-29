package hw9;

public class Place {
    public String country;
    public String capital;
    public double population;
    public String nationality;
    public String language;

    public void printinfo(){
        System.out.println("\nCountry -> "+country+ "\n\tCapital -> "+capital +"\n\tPopulation -> "+population+
                "\n\tNationality ->"+nationality+"\n\tLanguage -> "+language );
    }

}
