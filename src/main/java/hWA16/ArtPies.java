package hWA16;

public class ArtPies {
    private int year;
    private ArtType type;
    private String nameOfArtPies;

    public ArtPies(int year, ArtType type, String nameOfArtPies) {
        this.year = year;
        this.type = type;
        this.nameOfArtPies = nameOfArtPies;
    }

    public int getYear() {
        return year;
    }

    public ArtType getType() {
        return type;
    }

    public String getNameOfArtPies() {
        return nameOfArtPies;
    }
    public String printInfo(){
        return "Artpies: "+type+" "+nameOfArtPies+" Year: "+year;
    }
}
