package hw8_z;

public class VacationPlan {
    public String country;
    public String city;
    public String dates;
    public String transportation;
    public int numberOfDays;
    public double price;

    public void getsCheaper(){
    System.out.println(country+ " gets cheaper");
    }
    public void getPopular(){
    System.out.println(city+" becomes popular among americans");
    }
    public void availableTours(){
        System.out.println("Currently available tour is: "+ country+ ", " +city+" for "+price);

    }


}
