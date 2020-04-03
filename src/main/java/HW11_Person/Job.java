package HW11_Person;

public class Job {
    private String occupation;
    private String company;
   private Boolean hasJob;

    public Job(String occupation, String company, Boolean hasJob) {
        this.occupation = occupation;
        this.company = company;
        this.hasJob = hasJob;
    }

    public void printJob(){
        if(hasJob) {
            System.out.println("\nOccupation: " + occupation + " at " + company);
        }else{
            System.out.println("unemployed");
        }


    }
}
