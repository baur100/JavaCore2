package hw9;

public class Store {
        public String type;
        public String name;
        public String address;
        public boolean openOnWeekend;
        public int openingHour;
        public int closingHour;
        public String pricing;

        public void hours(){
            System.out.println(openingHour + ":00-" + closingHour +":00");
        }
        public void printInfo(){
            System.out.println(name+  " " + address) ;
        }
    }
