package hWA11;

public class Insurance {
    private String type;
    private String startDate;
    private int duration;
    private int price;
    private String planName;

    public Insurance(String type, String startDate, int duration, int price, String planName) {
        this.type = type;
        this.startDate = startDate;
        this.duration = duration;
        this.price = price;
        this.planName = planName;
    }

    public String getPlanName() {
        return planName;
    }

    public String getStartDate() {
        return startDate;
    }

    public int getDuration() {
        return duration;
    }

    public void printInfo(){
        System.out.println("Insurance type: "+type+"\nPlan: "+planName+"\nStart: " +startDate+"\n\tDuration: "+duration+ " monthes"+"\nPrice per month: "+price);
    }
}
