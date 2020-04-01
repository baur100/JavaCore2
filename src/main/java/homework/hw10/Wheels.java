package homework.hw10;

public class Wheels {
    private int radius;
    private String tireMake;
    private boolean isTireGood;

    public Wheels() {
    }

    public Wheels(int radius, String tireMake, boolean isTireGood) {
        this.radius = radius;
        this.tireMake = tireMake;
        this.isTireGood = isTireGood;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getTireMake() {
        return tireMake;
    }

    public void setTireMake(String tireMake) {
        this.tireMake = tireMake;
    }

    public boolean isTireGood() {
        return isTireGood;
    }

    public void setTireGood(boolean tireGood) {
        isTireGood = tireGood;
    }

    public void replaceTire() {
        if (this.isTireGood == false) {
            this.isTireGood = true;
            System.out.println("Tire replaced");
        }
        System.out.println("Tire is good");
    }

    public void printInfo() {
        System.out.println();
        System.out.println("Tire make is " + this.tireMake);
        System.out.println("Wheel radius is: " + this.radius);
        if (this.isTireGood == false) {
            System.out.println("Tires need to be replaced");
            return;
        }
        System.out.println("Tire is good");
    }

}

