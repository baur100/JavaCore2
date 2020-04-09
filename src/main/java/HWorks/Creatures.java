package HWorks;

public class Creatures {
    private String designation;
    private int averageLifeLasting;
    private double averageHeight;
    private String averageColor;
    private String amiability;
    private String habitat;

    public Creatures(){}
    public Creatures(String designation, int lifeLasting, double height,
                     String color, String amiability, String habitat) {
        this.averageColor = color;
        this.averageHeight = height;
        this.designation = designation;
        this.averageLifeLasting = lifeLasting;
        this.amiability = amiability;
        this.habitat = habitat;

    }
        public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public int getAverageLifeLasting() {
        return averageLifeLasting;
    }
    public void setAverageLifeLasting(int averageLifeLasting) {
        this.averageLifeLasting = averageLifeLasting;
    }
    public double getAverageHeight() {
        return averageHeight;
    }
    public void setAverageHeight(double averageHeight) {
        this.averageHeight = averageHeight;
    }
    public String getAverageColor() {
        return averageColor;
    }
    public void setAverageColor(String averageColor) {
        this.averageColor = averageColor;
    }
    public String getAmiability() {
        return amiability;
    }
    public void setAmiability(String amiability) {
        this.amiability = amiability;
    }

    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public  void printCreature(){
        System.out.println(designation+" "+"\nCountries with largest populations: "+"\nHabitat: "+habitat+
               "\nGeneral amiability: "+amiability+"\nAverage life lasting: "+
                averageLifeLasting+"\nMost average colors and height: "+averageColor+","+averageHeight+" cm" );
    }

    }

