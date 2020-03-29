package HW9;

public class pilot {

    public String name;
    public String license;
    public String position;
    public String likes;


    public void coffeeCheck(boolean coffee){
        if (coffee == true) {
            System.out.println("Mr. " + name + " will fly this flight after his " + likes);
        } else {System.out.println("Mr. " + name + " is going to sleep during flight");}
    }
    public boolean breakTime(int sleepTime) {
        boolean ready;
        if (sleepTime <= 10) {
            ready = false;
            System.out.println("Mr. " + name + " can not legally fly airplane without " + likes);
        }
        else {System.out.println("Another one " + likes + " please for " + name);
        ready = true;
        }
        return ready;
    }

}

