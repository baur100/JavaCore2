package homework15;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> jobs = new ArrayList<String>();
        jobs.add("Tester");
        jobs.add("Engineer");
        jobs.add("SDET");
        jobs.add("Developer");
        jobs.add("Devops");

        System.out.println(jobs.size());
        System.out.println(jobs.get(3));
        System.out.println(jobs.get(0));
        System.out.println( );

        jobs.remove(0);
        System.out.println(jobs.get(0));
        System.out.println(jobs.size());

        System.out.println( );
        System.out.println(jobs.get(2));
        jobs.add(2,"CTO");
        System.out.println(jobs.get(2));
        System.out.println(jobs.size());
        System.out.println(jobs);

    }
}
